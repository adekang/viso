package com.example.viso.service;

import com.example.viso.entity.BarRaceEntity;

import java.util.List;

public interface IBarService {

    List<BarRaceEntity> selectBar(String category);
}
