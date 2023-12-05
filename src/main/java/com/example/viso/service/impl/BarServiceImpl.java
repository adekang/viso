package com.example.viso.service.impl;

import com.example.viso.entity.BarRaceEntity;
import com.example.viso.entity.ForceNodeEntity;
import com.example.viso.mapper.BarMapper;
import com.example.viso.service.IBarService;
import com.example.viso.service.ex.SelectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarServiceImpl implements IBarService {

    @Autowired
    private BarMapper mapper;

    @Override
    public List<BarRaceEntity> selectBar(String category) {
        List<BarRaceEntity> list = mapper.selectBar(category);
        if (list == null && list.size() == 0) {
            throw new SelectException("数据库异常");
        }
        return list;

    }
}
