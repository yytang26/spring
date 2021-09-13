package com.tyy.aop.aop;

import com.tyy.aop.beans.factory.BeanFactory;

/**
 * @author:tyy
 * @date:2021/9/7
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
