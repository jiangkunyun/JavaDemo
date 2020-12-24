package org.example.ssm.service;

import org.example.ssm.dao.UserDao;
import org.example.ssm.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    public void addUser(User user) {
        userDao.addUser(user);
    }

    // 根据 id 删除
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    // 获取所有user
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    //修改
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
