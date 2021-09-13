package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class BeanDefinition {

    private Object bean;

    private String beanClassName;

    private Class beanClass;

    public BeanDefinition() {

    }

    public void setBeanClassName(String name) {
        this.beanClassName = name;
        try {
            beanClass = Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public String getClassName() {
        return beanClassName;
    }

    public void setClassName(String className) {
        this.beanClassName = className;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
