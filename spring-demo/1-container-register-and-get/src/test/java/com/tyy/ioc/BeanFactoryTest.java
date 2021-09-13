package com.tyy.ioc;

import org.junit.Test;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class BeanFactoryTest {

    @Test
    public void testBeanFactory() {
        //1.初始化bean 工厂
        BeanFactory beanFactory = new BeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3.获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");

        //4.使用bean
        userService.hello("tyy");
    }
}
