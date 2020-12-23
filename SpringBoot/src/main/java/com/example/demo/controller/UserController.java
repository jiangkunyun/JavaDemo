package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试控制器
 */
@RestController
public class UserController {

    @Resource//按byName自动装配
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(String name){
        return userService.getAll();
    }
}
