package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 * @desc:
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return this.bean;
    }

}
