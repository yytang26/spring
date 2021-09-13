package com.tyy.ioc;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class UserService {

    private User user;

    public void hello() {
        System.out.println("Hello " + user.getName());
    }

    public void setUser(User user) {
        this.user = user;
    }
}
