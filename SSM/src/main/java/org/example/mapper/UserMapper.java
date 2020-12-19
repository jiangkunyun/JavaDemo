package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.entity.User;

import java.util.List;

/**
 *通过注解配置的User
 */
public interface UserMapper {

    // 根据 id 寻找对应的 User
    @Select("SELECT * FROM user WHERE id = #{id}")
    User getUserById(int id);

    // 新增
    @Insert("INSERT INTO `user` ( id, username ) VALUES (#{id},#{username})")
    //keyProperty java对象的属性；keyColumn表示数据库的字段
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    void addUser(User user);

    // 根据 id 删除
    @Delete("DELETE FROM student WHERE student_id = #{id}")
    void deleteUser(int id);

    // 获取所有user
    @Select("SELECT * from `user`")
    List<User> getAllUser();

    //修改
    @Update("UPDATE `user` SET username = #{username} WHERE id = #{id}")
    void updateUser(User user);
}
