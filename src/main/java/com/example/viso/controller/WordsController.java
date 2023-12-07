package com.example.viso.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.viso.entity.WordsEntity;
import com.example.viso.service.impl.WordsServiceImpl;
import com.example.viso.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/words")
public class WordsController extends BaseController {

    @Autowired
    private WordsServiceImpl wordsService;

    @RequestMapping("/findAllByCategory")
    public JsonResult<List<WordsEntity>> selectWordByTitle(@RequestParam String category) {
        QueryWrapper<WordsEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("category", category).and(wrapper -> wrapper.ge("value", 50));
        List<WordsEntity> list = wordsService.list(queryWrapper);
        return new JsonResult<>(OK, "成功", list);
    }
}
