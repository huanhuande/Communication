package com.huan.Controller;

import com.huan.Service.UserService;
import com.huan.bean.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Hs on 2017/5/27.
 */

@Controller
@RequestMapping("/luntan")
public class UserController {
@Resource
    private UserService userService;

    @RequestMapping(value="/user/login", method= RequestMethod.GET)
    public String login(HttpServletRequest request,User user){
        System.out.println("进来登录");
        return "user/login";


    }


    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index(){
        System.out.println("进来index");
        return "index";
    }

    @RequestMapping(value="/user/reg", method= RequestMethod.GET)
    public String register(){
        System.out.println("进来注册");
        return "user/reg";
    }


    @RequestMapping("/register")
    public String register(HttpServletRequest request){
        System.out.print("户数地区湖区");
        return "login";
    }
}
