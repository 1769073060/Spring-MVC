package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FornController {
    @RequestMapping("/e/e1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);

        return "index";
    }

}
