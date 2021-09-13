package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public interface BeanFactory {

    Object getBean(String name);


    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
