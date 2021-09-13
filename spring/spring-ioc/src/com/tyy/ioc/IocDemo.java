package com.tyy.ioc;

import com.tyy.ioc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:tyy
 * @date:2021/8/26
 */
public class IocDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.toString());
    }
}
