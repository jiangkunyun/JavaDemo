package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * User 的控制类
 */
@Controller
@RequestMapping("mapping")
public class UserMapperController {

    @Resource(name="userMapperService")//指定名称自动装配
    private UserService userService;

    /**
     * 通过 Mapper 动态代理和注解查询用户信息
     * @param model
     * @return
     */
    @RequestMapping("/getUserById")
    public String getUserById(Model model) {
        int id = 1;
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "index";
    }
}
