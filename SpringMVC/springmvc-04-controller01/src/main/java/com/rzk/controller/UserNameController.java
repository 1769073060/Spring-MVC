package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("u2")
public class UserNameController {

    @RequestMapping("/t2")
    public String test1(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);
        return "index";
    }
}
