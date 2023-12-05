package com.example.viso.mapper;


import com.example.viso.entity.SunburstEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SunburstMapper {
    List<SunburstEntity> selectSun();
}
