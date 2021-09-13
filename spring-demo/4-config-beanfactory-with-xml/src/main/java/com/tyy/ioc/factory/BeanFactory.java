package com.tyy.ioc.factory;

import com.tyy.ioc.BeanDefinition;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public interface BeanFactory {

    Object getBean(String name);


    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
