package com.example.viso.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SunburstServiceTest {

    @Autowired
    private ISunburstService service;

    @Test
    public void selectSun(){
        service.selectSun();
    }
}
