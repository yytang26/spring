package com.tyy.ioc;

import com.tyy.ioc.beans.BeanDefinition;
import com.tyy.ioc.beans.factory.AutowireCapableBeanFactory;
import com.tyy.ioc.beans.factory.BeanFactory;
import org.junit.Test;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {

        //1.读取配置文件


        //2. 初始化bean工厂
        BeanFactory beanFactory  = new AutowireCapableBeanFactory();
        //3. 生成beanDefinition
        BeanDefinition beanDefinition = new BeanDefinition();

        //4. 初始化bean

        //5. 使用bean

    }

}
