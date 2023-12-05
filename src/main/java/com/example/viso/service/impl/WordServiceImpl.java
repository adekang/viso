package com.example.viso.service.impl;

import com.example.viso.entity.BarRaceEntity;
import com.example.viso.entity.WordEntity;
import com.example.viso.mapper.WordMapper;
import com.example.viso.service.IWordService;
import com.example.viso.service.ex.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements IWordService {
    @Autowired
    private WordMapper mapper;
    @Override
    public List<WordEntity> selectWord(String category) {
        List<WordEntity> list = mapper.selectWord(category);
        if (list == null && list.size() == 0) {
            throw new SelectException("数据库异常");
        }
        return list;
    }
}
