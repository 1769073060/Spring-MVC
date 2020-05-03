package com.rzk.Observer01;

import java.util.ArrayList;
import java.util.List;

/*
* 被观察者
* */
public interface Subject  {


    //添加观察者
    void addServer(Observer ob);

    //删除观察者
    void removeServer(Observer ob);

    //向观察者发信息
    void notityServer(Object msg);
}
