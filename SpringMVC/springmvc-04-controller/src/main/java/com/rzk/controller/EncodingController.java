package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.annotation.WebFilter;

@Controller
public class EncodingController {
    @RequestMapping("/e/t1")
    public String test(String name, Model model){
        model.addAttribute("hello",name);

        return "Login";
    }
}
