package com.example.viso.service;

import com.example.viso.entity.PaperEntity;

import java.util.List;

public interface IPaperService {

    List<PaperEntity> selectPaper(String category);

    List<PaperEntity> selectPaperByTitle(String title);
    List<PaperEntity> selectPaperByName(String name);
}
