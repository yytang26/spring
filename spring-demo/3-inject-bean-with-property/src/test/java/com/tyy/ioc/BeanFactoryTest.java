package com.tyy.ioc;

import com.tyy.ioc.property.PropertyValue;
import com.tyy.ioc.property.PropertyValues;
import org.junit.Test;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class BeanFactoryTest {

    @Test
    public void testBeanFactory() throws Exception {

        //1.初始化bean factory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //2.bean 定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.tyy.ioc.UserService");
        //3.bean中注入属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "tyy"));
        beanDefinition.setPropertyValues(propertyValues);

        //4.创建bean
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        //5.使用bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.hello();
    }
}
