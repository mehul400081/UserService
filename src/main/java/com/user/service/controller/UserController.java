package com.user.service.controller;

import com.user.service.component.UserComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
@Autowired
private UserComponent component;

@GetMapping("/name")
    public String getUserName(){
        return component.getUserName() +"--"+ component.getAge() +"--"+ component.getPinCode();

    }

}
