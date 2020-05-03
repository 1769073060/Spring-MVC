package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(path = "/text")
    public String setHello(Model model){
        //封装数据
        model.addAttribute("msg","你好");
        //会被视图解析器处理
        return "text";
    }
}
