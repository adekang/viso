package com.example.viso.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ForceMapperTest {

    @Autowired
    private ForceMapper mapper;

    @Test
    public void selectNode(){
        List<String> test_list=new ArrayList<>();
        test_list.add("Adlarson P. BESIII Collaboration");
        test_list.add("Van Haevermaet H. for the CMS Collaboration");
        test_list.add("Wang M.");

        System.out.println(mapper.selectNode("hep-ex",test_list));
    }

    @Test
    public void selectLink(){
        System.out.println(mapper.selectLink("astro-ph"));
    }
}
