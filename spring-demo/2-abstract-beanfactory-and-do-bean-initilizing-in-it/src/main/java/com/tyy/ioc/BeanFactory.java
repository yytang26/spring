package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public interface BeanFactory {

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);

    Object getBean(String name);
}
