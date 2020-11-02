package com.yujizi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: generic-mapper-abc
 * @Package: com.yujizi.controller
 * @ClassName: LoginController
 * @Author: ychw
 * @Description:
 * @Date: 2020/11/1 14:08
 * @Version: 1.0
 */
@Controller
@RequestMapping("sys")
public class LoginController {

    @GetMapping("banji/login")
    public String banjiLogin(HttpSession session,String user){
        session.setAttribute("user",user);
        return "yjz";
    }

    @GetMapping("account/login")
    public String accountLogin(HttpSession session,String user){
        session.setAttribute("user",user);
        return "account";
    }

    @GetMapping("hello")
    @ResponseBody
    public String test(){
        return "hello";
    }

}
