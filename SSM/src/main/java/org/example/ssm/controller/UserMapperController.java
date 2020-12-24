package org.example.ssm.controller;

import org.example.ssm.entity.User;
import org.example.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * User 的控制类
 */
@Controller
@RequestMapping("mapping")
public class UserMapperController {

    @Resource(name="userMapperService")
    private UserService userService;

    /**
     * 通过 Mapper 动态代理和注解查询所有用户信息
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
