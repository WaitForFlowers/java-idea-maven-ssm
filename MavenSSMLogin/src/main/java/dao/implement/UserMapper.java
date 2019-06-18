package dao.implement;

import entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zwh
 * @data 2019--06
 */
public interface UserMapper {
    public User login(@Param("name") String name, @Param("pwd") String pwd);
}
