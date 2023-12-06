package com.example.viso.service;

import com.example.viso.entity.ForceEntity;
import com.example.viso.entity.ForceLinkEntity;
import com.example.viso.entity.ForceNodeEntity;

import java.util.List;

public interface IForceService {

    ForceEntity selectForce(String category);

    List<ForceLinkEntity> selectByName(String name);
}
