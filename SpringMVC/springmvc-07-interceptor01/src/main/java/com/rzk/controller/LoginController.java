package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "Login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session,String username,String password){
        session.setAttribute("userloginInfo",username);
        return "main";
    }
}
