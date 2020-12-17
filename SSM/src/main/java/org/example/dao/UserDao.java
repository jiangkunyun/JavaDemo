package org.example.dao;

import org.example.entity.User;

import java.util.List;

/**
 * 通过xml配置的User
 */
public interface UserDao {
    // 根据 id 寻找对应的 User
    User getUserById(int id);

    // 新增
    void addUser(User user);

    // 根据 id 删除
    void deleteUser(int id);

    // 获取所有user
    List<User> getAllUser();

    //修改
    void updateUser(User user);
}
