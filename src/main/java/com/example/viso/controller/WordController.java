package com.example.viso.controller;


import com.example.viso.entity.WordEntity;
import com.example.viso.service.IWordService;
import com.example.viso.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Word")
public class WordController extends BaseController {
    @Autowired
    private IWordService service;

    @RequestMapping("selectWord")
    @CrossOrigin(origins = "*")
    public JsonResult<List<WordEntity>> selectBar(String category) {
        List<WordEntity> list = service.selectWord(category);
        return new JsonResult<>(OK, "查询" + category + "成功", list);
    }
}
