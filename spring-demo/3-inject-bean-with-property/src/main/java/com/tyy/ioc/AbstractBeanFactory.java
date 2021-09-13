package com.tyy.ioc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {

        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name,beanDefinition);
    }

    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
