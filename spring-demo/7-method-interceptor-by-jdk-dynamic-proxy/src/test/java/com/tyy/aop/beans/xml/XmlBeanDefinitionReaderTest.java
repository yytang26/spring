package com.tyy.aop.beans.xml;

import com.tyy.aop.beans.BeanDefinition;
import com.tyy.aop.beans.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("aop.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);
	}
}
