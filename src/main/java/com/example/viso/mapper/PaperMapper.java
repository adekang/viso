package com.example.viso.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.viso.entity.PaperEntity;
import com.example.viso.entity.WordsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaperMapper  extends BaseMapper<PaperEntity> {

    List<PaperEntity> selectByCate(String category);

    List<PaperEntity> selectByName(String name);

    List<PaperEntity> selectByTitle(String title);
}
