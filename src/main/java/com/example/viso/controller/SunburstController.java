package com.example.viso.controller;


import com.example.viso.entity.ForceNodeEntity;
import com.example.viso.entity.SunburstEntity;
import com.example.viso.service.ISunburstService;
import com.example.viso.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Sun")
public class SunburstController extends BaseController{
    @Autowired
    private ISunburstService service;
    @RequestMapping("selectSun")
    @CrossOrigin(origins = "*")
    public JsonResult<List<SunburstEntity>> selectSun(){
        List<SunburstEntity> list=service.selectSun();

        System.out.println(list);
        return new JsonResult<>(OK,"查询成功",list);
    }
}
