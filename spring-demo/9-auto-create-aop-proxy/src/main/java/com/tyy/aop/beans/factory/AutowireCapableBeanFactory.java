package com.tyy.aop.beans.factory;




import com.tyy.aop.BeanReference;
import com.tyy.aop.beans.BeanDefinition;
import com.tyy.aop.beans.PropertyValue;

import java.lang.reflect.Field;

/**
 * 可自动装配内容的BeanFactory
 *
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

	protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
		for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
			Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
			declaredField.setAccessible(true);
			Object value = propertyValue.getValue();
			if (value instanceof BeanReference) {
				BeanReference beanReference = (BeanReference) value;
				value = getBean(beanReference.getName());
			}
			declaredField.set(bean, value);
		}
	}
}
