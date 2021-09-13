package com.tyy.aop.context;

import com.tyy.aop.HelloWorldService;
import cpm.tyy.aop.context.ApplicationContext;
import cpm.tyy.aop.context.ClassPathXmlApplicationContext;
import org.junit.Test;


public class ApplicationContextTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
