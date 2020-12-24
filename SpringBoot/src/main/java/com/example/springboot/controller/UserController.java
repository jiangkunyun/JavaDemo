package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试控制器
 */
@RestController //@RestController等于@Controller和@ResponseBody
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
