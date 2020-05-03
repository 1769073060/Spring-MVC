package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//代表这个类被Spring接管,被这个注解的类中所有的方法,
// 如果返回String,并且有具体页面可以跳转,那么就会被视图解析器解析
@Controller
public class HelloController  {
    @RequestMapping("/text")
    public String text(Model model){
        //封装数据
        model.addAttribute("msg","Hello,欢迎来到德莱联盟");

        return "text";//会被视图解析器处理
    }
    @RequestMapping("/Yello")//url访问的地址  http://localhost:8080/springmvc_03_annotation_war_exploded/Yello
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","hello,Spring");
        //会被视图解析器处理
        return "Hello";
    }
}
