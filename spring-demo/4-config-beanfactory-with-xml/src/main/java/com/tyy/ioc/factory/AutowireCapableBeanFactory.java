package com.tyy.ioc.factory;

import com.tyy.ioc.BeanDefinition;
import com.tyy.ioc.property.PropertyValue;
import com.tyy.ioc.property.PropertyValues;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {

        //创建bean
        Object bean = createBeanInstance(beanDefinition);

        //注入属性
        applyPropertyValues(bean, beanDefinition);

        return bean;

    }

    public Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    public void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        List<PropertyValue> propertyValueList = propertyValues.getPropertyValue();
        for (PropertyValue propertyValue : propertyValueList) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean,propertyValue.getValue());
        }
    }
}
