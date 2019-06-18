package servers;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Log;

/**
 * @author zwh
 * @data 2019--05
 */
@Service("UserServer")
public class UserServer {
    @Autowired
    private UserDao userDao;
    public void login(String name,String pwd){
        User user = userDao.login(name,pwd);
        if (user == null) {
            System.out.println("输入有误啊");
            Log.logger.info(name+"登录失败");
        }else{
            Log.logger.info(name+"登录成功");
            System.out.println("登录成功");
        }

    }
}
