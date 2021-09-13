package com.tyy.ioc;

import com.tyy.ioc.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;


/**
 * @author:tyy
 * @date:2021/8/28
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private ResourceLoader resourceLoader;

    private Map<String, BeanDefinition> registry;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
