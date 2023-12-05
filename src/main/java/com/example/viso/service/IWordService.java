package com.example.viso.service;

import com.example.viso.entity.WordEntity;

import java.util.List;

public interface IWordService {

    List<WordEntity> selectWord(String category);
}
