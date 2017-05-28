package com.huan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hs on 2017/5/27.
 */

@Controller
@RequestMapping("/luntan")
public class UserController {

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

    @RequestMapping("/register")
    public String register(){
        System.out.println("进来注册");
        return "register";
    }
}
