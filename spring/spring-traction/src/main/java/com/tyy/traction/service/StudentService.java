package com.tyy.traction.service;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.tyy.traction.entity.Student;
import com.tyy.traction.mapper.StudentMapper;
import com.tyy.traction.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author:tyy
 * @date:2021/9/11
 */
@Service
public class StudentService {

   @Autowired
   private StudentMapper studentMapper;

   @Autowired
   private UserService userService;

   @Transactional
   public void saveStudent(){
      System.out.println(123);
      Student student = new Student();
      student.setAddress("诸暨");
      student.setAge(18);
      student.setName("tyy");
      studentMapper.insert(student);
      System.out.println(456);
      userService.insertUser();
   }
}
