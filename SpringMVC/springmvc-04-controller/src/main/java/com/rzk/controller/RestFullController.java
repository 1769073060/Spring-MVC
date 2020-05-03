package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFullController {
    //映射访问路径
    @RequestMapping("/r1")
    public String RestFull(int a,int b,Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        int result = a+b;
        model.addAttribute("hello",result);

        //返回视图位置
        return "Login";
    }
    //映射访问路径
    @GetMapping("/r2/{a}/{b}")
    public String RestFull2(@PathVariable int a,@PathVariable String b, Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        String result = a+b;
        model.addAttribute("hello",result);

        //返回视图位置
        return "Login";
    }
    //映射访问路径
    @RequestMapping(value = "/r3/{a}/{b}",method = RequestMethod.GET)
    public String RestFull3(@PathVariable int a,@PathVariable String b, Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        String result = a+b;
        model.addAttribute("hello",result);

        //返回视图位置
        return "Login";
    }
}
