package com.example.springboot.service;

import com.example.springboot.dao.UserDao;
import com.example.springboot.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl  implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
