package com.example.viso.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.viso.entity.ForceEntity;
import com.example.viso.entity.ForceLinkEntity;
import com.example.viso.entity.ForceNodeEntity;
import com.example.viso.service.IForceService;
import com.example.viso.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Force")
public class ForceController extends BaseController {

    @Autowired
    private IForceService service;

    @RequestMapping("selectForce")
    @CrossOrigin(origins = "*")
    public JsonResult<ForceEntity> selectNode(String category) {
        ForceEntity force = service.selectForce(category);

        return new JsonResult<>(OK, "查询" + category + "力导向图数据成功", force);
    }


    @RequestMapping("/selectByName")
    public JsonResult<List<ForceLinkEntity>> selectByName(String name) {
        List<ForceLinkEntity> list = service.selectByName(name);
        return new JsonResult<>(OK, "查询成功",list);
    }
}
