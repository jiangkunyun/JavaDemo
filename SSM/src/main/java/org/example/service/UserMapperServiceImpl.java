package org.example.service;

import org.example.entity.User;
import org.example.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    // 根据 id 删除
    public void deleteUser(int id) {
        userMapper.deleteUser(id);
    }

    // 获取所有user
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    //修改
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}

