package com.tyy.aop.context;

import com.tyy.aop.beans.BeanDefinition;
import com.tyy.aop.beans.factory.AbstractBeanFactory;
import com.tyy.aop.beans.factory.AutowireCapableBeanFactory;
import com.tyy.aop.beans.io.ResourceLoader;
import com.tyy.aop.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author yihua.huang@dianping.com
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

	private String configLocation;

	public ClassPathXmlApplicationContext(String configLocation) throws Exception {
		this(configLocation, new AutowireCapableBeanFactory());
	}

	public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
		super(beanFactory);
		this.configLocation = configLocation;
		refresh();
	}

	@Override
	protected void loadBeanDefinitions(AbstractBeanFactory beanFactory) throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
		for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
			beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
		}
	}

}
