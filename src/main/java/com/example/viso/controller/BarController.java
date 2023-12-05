package com.example.viso.controller;


import com.example.viso.entity.BarRaceEntity;
import com.example.viso.service.IBarService;
import com.example.viso.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Bar")
public class BarController extends BaseController{

    @Autowired
    private IBarService service;

    @RequestMapping("selectBar")
    @CrossOrigin(origins = "*")
    public JsonResult<List<BarRaceEntity>> selectBar(String category){
        List<BarRaceEntity> list=service.selectBar(category);
        return new JsonResult<>(OK,"查询"+category+"成功",list);
    }
}
