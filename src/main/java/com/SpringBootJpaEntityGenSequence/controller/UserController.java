package com.SpringBootJpaEntityGenSequence.controller;

import com.SpringBootJpaEntityGenSequence.entity.User;
import com.SpringBootJpaEntityGenSequence.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(path="/test-jpa")
    public User getUser(){
        User user=new User("sairam","sairam8276@gmail.com");
        userService.saveUser(user);
        User output1=userService.getUser(100l);
        return output1;
    }

    @GetMapping(path="/read-jpa")
    public User getUser2(){
        User output1=userService.getUser(1l);
        return output1;
    }
}
