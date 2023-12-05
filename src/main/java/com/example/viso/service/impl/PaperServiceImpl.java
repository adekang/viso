package com.example.viso.service.impl;

import com.example.viso.entity.PaperEntity;
import com.example.viso.mapper.PaperMapper;
import com.example.viso.service.IPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperServiceImpl implements IPaperService {
    @Autowired
    private PaperMapper mapper;

    @Override
    public List<PaperEntity> selectPaper(String category) {
        List<PaperEntity> list = mapper.selectByCate("%" + category + "%");
        return list;
    }

    @Override
    public List<PaperEntity> selectPaperByTitle(String title) {

        List<PaperEntity> list = mapper.selectByTitle("%" + title + "%");
        return list;
    }

    @Override
    public List<PaperEntity> selectPaperByName(String name) {

        List<PaperEntity> list = mapper.selectByName("%" + name + "%");
        return list;
    }
}
