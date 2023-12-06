package com.example.viso.service.impl;

import com.example.viso.entity.BarRaceEntity;
import com.example.viso.mapper.BarMapper;
import com.example.viso.service.IBarService;
import com.example.viso.service.ex.SelectException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.*;

@Service
public class BarServiceImpl implements IBarService {

    @Autowired
    private BarMapper mapper;

    @Override
    public List<List> selectBar(String category) {

        List<List> results = new ArrayList<>();
        results.add(Arrays.asList("Value","Name","Month"));
        List<String> names = mapper.selectName(category);
        List<BarRaceEntity> list = mapper.selectBar(category,names);
        if (list == null && list.size() == 0) {
            throw new SelectException("数据库异常");
        }
        Map<String, Map<Integer, Integer>> statistic = new HashMap<>();

        for(BarRaceEntity entity : list) {
            // 1.累加统计
            String name = entity.getName();
            int month = entity.getDate().getMonth()+1;
            int value = entity.getValue();
            System.out.println(value);
            TreeMap<Integer,Integer> map = (TreeMap<Integer, Integer>) statistic.computeIfAbsent(name, k-> new TreeMap<>());
            map.put(month,value);
        }
        HashMap<Integer,String> monthMap = new HashMap<Integer,String>(){{
            put(1,"Jan");
            put(2,"Feb");
            put(3,"Mar");
            put(4,"Apr");
            put(5,"May");
            put(6,"Jun");
            put(7,"Jul");
            put(8,"Aug");
            put(9,"Sep");
            put(10,"Oct");
            put(11,"Nov");
            put(12,"Dec");
        }};
        // 生成结果
        for(Map.Entry<String, Map<Integer, Integer>> entry : statistic.entrySet()) {

            String name = entry.getKey();
            TreeMap<Integer, Integer> map = (TreeMap<Integer, Integer>) entry.getValue();
            map.putIfAbsent(1, 0);

            // 按月生成结果
            for(int i=1;i<=12;i++) {

                List<Object> result = new ArrayList<>();

                if(map.get(i)==null){
                    map.put(i,map.get(i-1));
                }
                Integer value = map.get(i);
                System.out.println(value);
                result.add(value);
                result.add(name);
                result.add(monthMap.get(i));
                results.add(result);

            }

        }
        return results;
    }


    @Override
    public List<String> selectName(String category){
        return mapper.selectName(category);
    }
}
