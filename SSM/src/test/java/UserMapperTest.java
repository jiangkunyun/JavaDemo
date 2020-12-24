import org.example.ssm.entity.User;
import org.example.ssm.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * UserMapper 的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetUserById() {
        int id = 1;
        User user = userMapper.getUserById(id);
        System.out.println(user.getId() + ":" + user.getUsername());
    }


    @Test
    public void testGetAllUser() {
        List<User> userList = userMapper.getAllUser();
        for(User user:userList) {
            System.out.println(user.getId() + ":" + user.getUsername());
        }
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("测试");
        userMapper.addUser(user);
        System.out.println(user.getId());
    }


    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("修改测试");
        userMapper.updateUser(user);
        System.out.println(userMapper.getUserById(1).getUsername());
    }
}
