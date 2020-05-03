package com.rzk.Observer02;
/*
* 观察者
* 关注公众号的人
* */
public interface Observer {
    //处理公众号发来的信息
    void handleNotify(Object message);
}
