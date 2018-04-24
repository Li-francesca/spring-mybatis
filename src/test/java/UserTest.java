import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void newUserTest(){
        User user=new User();
        user.setName("小米");
        user.setPassword("2018");
        user.setDob(new Date());
        user.setPhone("1355");

        userMapper.newUser(user);

    }
    @Test
    public void updateUser(){
        User user=new User();
        user.setId(13);
        user.setName("xiao_ming");
        user.setPassword("123");
        user.setDob(new Date());
        user.setPhone("1324");
        userMapper.updateUser(user);
    }
    @Test
    public void listAllUserTest(){
        List<User> userList=userMapper.listAllUser();
        System.out.println(userList);
    }
    @Test
    public void queryUserByNameTest(){
        String name="xiaoming";
        List<User> userList=userMapper.queryUserByName(name);
        System.out.println(userList);
    }

    @Test
    public void queryUserByIdTest(){
        User user=userMapper.queryUserById(13);
        System.out.println(user);
    }
    @Test
    public void delUserTest(){
        userMapper.delUser(13);
    }
}
