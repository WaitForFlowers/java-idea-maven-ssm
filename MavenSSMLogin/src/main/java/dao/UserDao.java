package dao;

import dao.implement.UserMapper;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author zwh
 * @data 2019--06
 */
@Repository("UserDao")
public class UserDao {
    @Autowired
    private UserMapper userMapper;
    public User login(String name,String pwd){
        return userMapper.login(name,pwd);
    }
}
