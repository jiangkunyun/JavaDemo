package org.example.ssm.controller;

import org.example.ssm.entity.User;
import org.example.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * User 的控制类
 */
@Controller
@RequestMapping("")
public class UserController {

    @Resource(name="userService")//按byName自动装配
    private UserService userService;

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    /**
     * 登录验证
     */
    @PostMapping("/chackLogin")
    @ResponseBody
    public String chackLogin(String name,String pwd, HttpSession session){
        session.setAttribute("username",name);//在session存入登录信息
        return "OK";
    }

    /**
     * 首页
     */
    @RequestMapping("/")
    public String home(Model model) {
        int id = 1;
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "index";
    }

    /**
     * 获取所有用户信息
     */
    //@RequestMapping(value="/getAllUser",method=RequestMethod.GET)
    @GetMapping("/getAllUser")
    /*@ResponseBody注解表示该方法的返回的结果直接写入HTTP响应正文中（ResponseBody）*/
    /*如果需要返回 自定义对象为JSON数据类型，需要增加jackson依赖*/
    @ResponseBody
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
