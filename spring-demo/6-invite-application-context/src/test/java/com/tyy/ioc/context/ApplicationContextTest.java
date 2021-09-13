package com.tyy.ioc.context;

import com.tyy.ioc.UserService;
import org.junit.Test;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.hello();
    }
}
