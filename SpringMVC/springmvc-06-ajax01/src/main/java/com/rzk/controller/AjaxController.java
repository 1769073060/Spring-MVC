package com.rzk.controller;


import com.rzk.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/a1")
    public void test(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1.param=>"+name);
        if ("rzk".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> test2(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("李四",1,"男"));
        list.add(new User("李五",2,"男"));
        list.add(new User("李六",3,"男"));
        return list;
    }

    @RequestMapping("/a3")
    public String test3(String name,String pwd){
        String msg = null;
        if (name !=null){
            if ("admin".equals(name)){
                msg = "OK";
            }else{
                msg ="No";
            }
        }
        if (pwd !=null){
            if ("admin".equals(pwd)){
                msg = "OK";
            }else{
                msg ="No";
            }
        }
        return msg;
    }

}
