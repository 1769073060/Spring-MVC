package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDome01  {
    @RequestMapping("/T1")
    public String TiMo(Model model){
        model.addAttribute("hello","hello Spring");
        return "form";
    }
}
