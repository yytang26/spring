package com.tyy.ioc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class BeanFactory {

    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String beanName) {

        if (beanDefinitionMap.containsKey(beanName)) {
            return beanDefinitionMap.get(beanName).getBean();
        }

        return null;
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
