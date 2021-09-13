package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class UserService {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello " + name);
    }
}
