package org.example.service;

import org.example.entity.User;

/**
 * User接口类
 */
public interface UserService {
    // 根据 id 寻找对应的 User，通过xml配置
    public User getUserById(int id);
}
