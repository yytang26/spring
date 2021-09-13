package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
