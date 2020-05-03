package com.rzk.Observer01;
/*
* 观察者
* */
public interface Observer {
    //处理被观察者发送来的消息
    //更新
    void update(Object ob);
}
