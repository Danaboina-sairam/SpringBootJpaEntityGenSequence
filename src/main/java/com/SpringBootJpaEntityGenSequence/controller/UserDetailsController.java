package com.SpringBootJpaEntityGenSequence.controller;

import com.SpringBootJpaEntityGenSequence.entity.UserDetails;
import com.SpringBootJpaEntityGenSequence.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;
    @GetMapping(path="/getUser")
    public UserDetails getUser(){
        UserDetails userDetails=new UserDetails("sairam","sairam8276@gmail.com");
        return userDetailsService.saveUser(userDetails);
    }
}
