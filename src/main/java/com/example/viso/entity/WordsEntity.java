package com.example.viso.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("words")
public class WordsEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer value;
    private String category;
}
