package com.wyh.think.in.mysql45.test1;

import com.wyh.think.in.mysql45.ThinkInMysql45Application;
import com.wyh.think.in.mysql45.test1.service.T1Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@TestPropertySource(locations = "classpath:application.yml")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ThinkInMysql45Application.class, Test1.class})
public class Test1 {

    @Autowired
    private T1Service t1Service;

    @Test
    public void test1(){
        t1Service.test1();
    }


}
