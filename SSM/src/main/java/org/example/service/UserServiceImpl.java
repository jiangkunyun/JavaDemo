package org.example.service;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserService 对应的实现类
 * 使用UserDao
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(int id) {
        System.out.println("使用UserServiceImpl");
        return userDao.getUserById(id);
    }
}
