package com.rzk.controller;

import com.rzk.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {


    @RequestMapping(path = "/u1")
    public String setName(@RequestParam("userName") String name, Model model){
        model.addAttribute("hello",name);

        return "Login";
    }
    /**
     * 接收前端用户传递的参数,判断参数的名字,假设名字直接在方法上,可以直接使用
     * 假设传递的是一个对象User,匹配User对象中的字段,如果名字一致就能匹配,要是不一样则为null
     *
     * @param student
     * @param model
     * @return
     */
    @RequestMapping(path = "/u2")
    public String setName2(Student student, Model model){
        model.addAttribute("student",student);

        return "Login";
    }

    @RequestMapping(path = "/u3")
    public String setName3(Student student,ModelMap modelMap){

        //"student"传到前端的数据
        modelMap.addAttribute("student",student);
        //返回映射地址
        return "Login";
    }
}
