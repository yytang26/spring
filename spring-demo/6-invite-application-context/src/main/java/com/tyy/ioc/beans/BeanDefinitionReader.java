package com.tyy.ioc.beans;

public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
