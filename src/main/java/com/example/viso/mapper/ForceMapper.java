package com.example.viso.mapper;


import com.example.viso.entity.ForceLinkEntity;
import com.example.viso.entity.ForceNodeEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ForceMapper {




    List<ForceLinkEntity> selectLink(String category);
    List<ForceNodeEntity> selectNode(@Param("category") String category,@Param("names") List<String> names);
}
