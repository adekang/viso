package com.example.viso.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BarMapperTest {

    @Autowired
    private BarMapper mapper;

    @Test
    public void selectBar(){
        System.out.println(mapper.selectBar("pyhsics"));
    }
}
