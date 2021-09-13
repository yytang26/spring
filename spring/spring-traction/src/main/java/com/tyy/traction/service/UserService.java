package com.tyy.traction.service;

import com.tyy.traction.entity.User;
import com.tyy.traction.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:tyy
 * @date:2021/9/11
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public void insertUser() {
        User user = new User();
        user.setAge(13);
        user.setEmail("123");
        user.setName("tyy");
        userMapper.insert(user);
    }
}
