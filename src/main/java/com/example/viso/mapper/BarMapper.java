package com.example.viso.mapper;


import com.example.viso.entity.BarRaceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BarMapper {

    List<BarRaceEntity> selectBar(@Param("category") String category, @Param("names") List<String> names);
    List<String> selectName(String category);
}
