package com.example.viso.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.viso.entity.PaperEntity;
import com.example.viso.entity.SunburstEntity;
import com.example.viso.entity.WordsEntity;
import com.example.viso.service.IPaperService;
import com.example.viso.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("Paper")
public class PaperController extends BaseController {

    @Autowired
    private IPaperService service;

    @RequestMapping("selectPaper")
    @CrossOrigin(origins = "*")
    public JsonResult<List<PaperEntity>> selectPaper(String category) {
        if (category.equals("computer_science")) category = "cs";
        if (category.equals("mathematics")) category = "math";
        if (category.equals("Statistics")) category = "stat";
        if (category.equals("economics")) category = "econ";
        if (category.equals("electrical_engineering_and_systems_science")) category = "eess";
        if (category.equals("quantitative_finance")) category = "q-fin";
        if (category.equals("quantitative_biology")) category = "q-bio";
        List<PaperEntity> list = service.selectPaper(category);
        return new JsonResult<>(OK, "查询" + category + "成功", list);
    }

    @RequestMapping("selectPaperByTitle")
    @CrossOrigin(origins = "*")
    public JsonResult<List<PaperEntity>> selectPaperByTitle(String title) {
        List<PaperEntity> list = service.selectPaperByTitle(title);
//        System.out.println(list);
        return new JsonResult<>(OK, "查询" + title + "成功", list);
    }

    @RequestMapping("selectPaperByName")
    @CrossOrigin(origins = "*")
    public JsonResult<List<PaperEntity>> selectPaperByName(String name) {
        name = Arrays.stream(name.split(" "))
                .reduce((a, b) -> b + " " + a)
                .orElse("");
        List<PaperEntity> list = service.selectPaperByName(name);
//        System.out.println(list);
        return new JsonResult<>(OK, "查询" + name + "成功", list);
    }


    @RequestMapping("/selectByCategory")
    public JsonResult<List<PaperEntity>> selectByCategory(@RequestParam String categories) {
        QueryWrapper<PaperEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("categories", categories);
        queryWrapper.last("LIMIT 200"); // 限制结果集为前200条数据
        List<PaperEntity> list = service.list(queryWrapper);
        return new JsonResult<>(OK, "成功", list);
    }
}
