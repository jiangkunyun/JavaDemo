package org.example.service;

import org.example.dao.UserDao;
import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserService 对应的实现类
 * 使用UserMapper
 */
@Service("userMapperService")
public class UserMapperServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(int id) {
        System.out.println("使用UserMapperServiceImpl");
        return userMapper.getUserById(id);
    }
}

