package com.rzk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/c1")
public class ControllerDome3 {
    @RequestMapping(path = "/t1")
    public String text(Model model){
        model.addAttribute("hello","ControllerDome3");

        return "Login";
    }

}
