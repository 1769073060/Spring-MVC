package com.rzk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest {
    @RequestMapping("/t1")//url访问的地址
    public String Test(Model model){
        model.addAttribute("msg","index");
        /*redirect*/
        return "index";
    }
}
