package com.example.viso.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.viso.entity.WordsEntity;
import com.example.viso.mapper.WordsMapper;
import org.springframework.stereotype.Service;

@Service
public class WordsService extends ServiceImpl<WordsMapper, WordsEntity> {
}
