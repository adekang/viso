package com.example.viso.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.viso.entity.WordsEntity;
import com.example.viso.mapper.WordsMapper;
import com.example.viso.service.IWordsService;
import org.springframework.stereotype.Service;

@Service
public class WordsServiceImpl extends ServiceImpl<WordsMapper, WordsEntity> implements IWordsService {
}
