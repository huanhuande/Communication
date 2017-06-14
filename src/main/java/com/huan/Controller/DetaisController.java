package com.huan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Hs on 2017/6/14.
 */
@Controller
@RequestMapping("/luntan")
public class DetaisController {

    @RequestMapping(value="/detail", method= RequestMethod.GET)
    public String Details(){
        System.out.println("进来Details");
        return "jie/detail";
    }

}
