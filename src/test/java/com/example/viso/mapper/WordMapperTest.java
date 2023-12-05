package com.example.viso.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WordMapperTest {

    @Autowired
    private WordMapper mapper;

    @Test
    public void selectWord(){
        System.out.println(mapper.selectWord("physics"));
    }
}
