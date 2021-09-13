package com.tyy.traction.controller;

import com.tyy.traction.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:tyy
 * @date:2021/9/11
 */
@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public void test() {
        System.out.println(123);
        studentService.saveStudent();
        System.out.println(123);
    }
}
