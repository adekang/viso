package com.example.viso.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PaperMapperTest {

    @Autowired
    private PaperMapper mapper;

    @Test
    public void selectByCate(){
        System.out.println(mapper.selectByCate("%astro-ph%"));
    }

    @Test
    public void selectByName(){
        System.out.println(mapper.selectByName("%Lohse Detlef%"));
    }

    @Test
    public void selectByTitle(){
        System.out.println(mapper.selectByTitle("%visual%"));
    }
}
