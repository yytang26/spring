package com.tyy.ioc.factory;

import com.tyy.ioc.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    private final List<String> beanDefinitionNames = new ArrayList<String>();

    public Object getBean(String name) throws Exception {

        BeanDefinition beanDefinition = beanDefinitionMap.get(name);

        if (beanDefinition == null) {
            throw new IllegalAccessException("no bean names " + name);
        }

        Object bean = beanDefinition.getBean();

        if (null == bean) {
            bean = doCreateBean(beanDefinition);
        }

        return bean;
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        beanDefinitionMap.put(name, beanDefinition);
        beanDefinitionNames.add(name);
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;

    public void preInstantiateSingletons() throws Exception {

        Iterator<String> iterator = this.beanDefinitionNames.iterator();

        while (iterator.hasNext()) {
            String beanName = iterator.next();
            getBean(beanName);
        }

    }
}
