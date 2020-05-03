package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session,String username,String password,Model model){
        //信息放到session中
        session.setAttribute("userloginInfo",username);
        model.addAttribute("username"+username);

        return "main";
    }

    @RequestMapping("/getOut")
    public String getOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "redirect:/WEB-INF/jsp/login";
    }
}
