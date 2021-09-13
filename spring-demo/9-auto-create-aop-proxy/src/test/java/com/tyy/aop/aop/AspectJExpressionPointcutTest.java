package com.tyy.aop.aop;

import com.tyy.aop.HelloWorldService;
import com.tyy.aop.beans.BeanDefinition;
import com.tyy.aop.beans.factory.AbstractBeanFactory;
import com.tyy.aop.beans.factory.AutowireCapableBeanFactory;
import com.tyy.aop.beans.factory.BeanFactory;
import com.tyy.aop.beans.io.ResourceLoader;
import com.tyy.aop.beans.xml.XmlBeanDefinitionReader;
import com.tyy.aop.context.ApplicationContext;

import com.tyy.aop.context.ClassPathXmlApplicationContext;
import org.aopalliance.aop.Advice;
import org.junit.Assert;
import org.junit.Test;
import com.tyy.aop.HelloWorldServiceImpl;

import java.awt.*;
import java.util.Map;


public class AspectJExpressionPointcutTest {

    @Test
    public void testClassFilter() throws Exception {
        String expression = "execution(* us.codecraft.tinyioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "execution(* us.codecraft.tinyioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloWorldServiceImpl.class.getDeclaredMethod("helloWorld"),HelloWorldServiceImpl.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testAdvice() throws Exception {
        String expression = "execution(* us.codecraft.tinyioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }
    @Test
    public void test() throws Exception {

        String expression = "execution(* us.codecraft.tinyioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);

        // 1.读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        // 2.初始化BeanFactory并注册bean
        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        Advice advice = new AspectJAroundAdvice();
        advisor.setExpression(expression);
        advisor.setAdvice(advice);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
        AspectJAwareAdvisorAutoProxyCreator creator = new AspectJAwareAdvisorAutoProxyCreator();
        creator.setBeanFactory(beanFactory);
        creator.postProcessAfterInitialization(helloWorldService,"helloWorldService");
    }
}
