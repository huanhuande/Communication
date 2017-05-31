package com.huan.Controller;

import com.huan.Service.UserService;
import com.huan.bean.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Hs on 2017/5/27.
 */

@Controller
@RequestMapping("/luntan")
public class UserController {
@Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        System.out.println("进来登录");
        return "login";
    }


    @RequestMapping("/index")
    public String index(){
        System.out.println("进来index");
        return "index";
    }

    @RequestMapping("/reg")
    public String register(){

        System.out.println("进来注册");
        return "reg";
    }


    @RequestMapping("/register")
    public String register(HttpServletRequest request){
        System.out.print("户数地区湖区");
        User user=new User();
        String username=request.getParameter("username");
        String pwd=request.getParameter("password");
        user.setPassword(pwd);
        user.setUsername(username);
        userService.save(user);
        return "login";
    }
}
