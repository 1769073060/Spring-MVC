package com.rzk.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rzk.pojo.User;
import com.rzk.util.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 标记这下面所有的方法只会返回字符串
 */
@RestController
@Controller
public class UserController {
    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
    //@ResponseBody  //加上它,它就不会走视图解析器,会直接返回一个字符串
    public String JsonDome1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("芮祝楷",1,"男");
        System.out.println(user);
        String s = mapper.writeValueAsString(user);
        return s;
    }


    @RequestMapping(value = "/j2")
    public String JsonDome2() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
        List<User> arrayList = new ArrayList<>();
        //创建一个对象
        User user1 = new User("芮祝楷1",1,"男");
        User user2 = new User("芮祝楷2",2,"男");
        User user3 = new User("芮祝楷3",3,"男");
        User user4 = new User("芮祝楷4",4,"男");
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);

//        String s = mapper.writeValueAsString(arrayList);
        return JSONUtil.getJson(arrayList);
    }

    @RequestMapping("/j3")
    public String JsonDome3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();


        Date date = new Date();

        return JSONUtil.getJson(date,"yyy-MM-dd HH:mm:ss");
    }

}
