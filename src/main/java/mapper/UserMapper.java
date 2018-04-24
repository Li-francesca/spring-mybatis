package mapper;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    public boolean newUser(User user);
    public boolean delUser(int id);
    public boolean updateUser(User user);
    public User queryUserById(int id);
    public List<User> listAllUser();
    public List<User> queryUserByName(String name);
}
