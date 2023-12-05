package com.example.viso.mapper;


import com.example.viso.entity.BarRaceEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BarMapper {

    List<BarRaceEntity> selectBar(String category);
}
