package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//代表这个类被Spring接管,被这个注解的类中所有的方法,
// 如果返回String,并且有具体页面可以跳转,那么就会被视图解析器解析
//声明Spring类的实例是一个控制器
@Controller
public class ControllerDome2 {
    //@RequestMapper注解用于映射url到控制器或一个特定的处理程序方法,可用于类和方法
    @RequestMapping(path = "/t1")
    public String demo1(Model model){

        model.addAttribute("hello","ControllerDome2");
        /*这里的Login要对应jsp的名字*/
        return "Login";
    }
    @RequestMapping(path = "/t2")
    public String demo2(Model model){

        model.addAttribute("hello","你好2");
        /*这里的Login要对应jsp的名字*/
        return "Login";
    }
    @RequestMapping(path = "/t3")
    public String demo3(Model model){

        model.addAttribute("hello","你好3");
        /*这里的Login要对应jsp的名字*/
        return "Login";
    }
}
