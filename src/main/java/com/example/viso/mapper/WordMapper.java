package com.example.viso.mapper;


import com.example.viso.entity.WordEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WordMapper {

    List<WordEntity> selectWord(String category);
}
