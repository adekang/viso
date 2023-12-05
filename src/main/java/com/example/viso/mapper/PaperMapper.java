package com.example.viso.mapper;

import com.example.viso.entity.PaperEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperMapper {

    List<PaperEntity> selectByCate(String category);

    List<PaperEntity> selectByName(String name);

    List<PaperEntity> selectByTitle(String title);
}
