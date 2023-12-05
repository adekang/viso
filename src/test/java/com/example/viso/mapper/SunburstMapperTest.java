package com.example.viso.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SunburstMapperTest {
    @Autowired
    private SunburstMapper mapper;

    @Test
    public void selectSun(){
        System.out.println(mapper.selectSun());
    }
}
