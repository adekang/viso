package com.example.viso.service;

import java.util.List;

public interface IBarService {

    List<List> selectBar(String category);
    List<String> selectName(String category);
}
