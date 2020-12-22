package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Resource//按byName自动装配
    private UserService userService;

    /**
     * 登录页
     *
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    /**
     * 登录验证
     * @return
     */
    @PostMapping("/chackLogin")
    @ResponseBody
    public String chackLogin(String name,String pwd, HttpSession session){
        session.setAttribute("username",name);
        return "OK";
    }

    /**
     * 通过 Mapper 映射文件查询用户信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/")
    public String getUser(Model model) {
        int id = 1;
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "index";
    }

    /**
     * 获取所有用户信息
     *
     * @return
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
