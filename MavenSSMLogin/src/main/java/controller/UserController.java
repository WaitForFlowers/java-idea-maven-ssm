package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import servers.UserServer;

/**
 * @author zwh
 * @data 2019--05
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
   private UserServer userServer;
//    路径中的 / 可以没有，不写也能正常访问
    @RequestMapping("/login")
    public String login(String name,String pwd){
        System.out.println(name+","+pwd);
        userServer.login(name,pwd);
        return "success";
    }
}
