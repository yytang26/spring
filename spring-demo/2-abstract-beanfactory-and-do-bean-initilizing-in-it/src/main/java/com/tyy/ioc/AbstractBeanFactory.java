package com.tyy.ioc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    ConcurrentHashMap<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {
        if (beanDefinitionMap.containsKey(name)) {
            return beanDefinitionMap.get(name).getBean();
        }
        return null;
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }

    /**
     * 根据类路径生成bean
     *
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
