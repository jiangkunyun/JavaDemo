package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * User 的控制类
 */
@Controller
@RequestMapping("")
public class UserController {

    @Resource//按byName自动装配
    private UserService userService;

    /**
     * 通过 Mapper 映射文件查询用户信息
     * @param model
     * @return
     */
    @RequestMapping("/getUserById")
    public String findUser(Model model) {
        int id = 1;
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "index";
    }
}
