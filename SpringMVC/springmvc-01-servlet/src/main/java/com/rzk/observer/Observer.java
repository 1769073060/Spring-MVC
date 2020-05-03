package com.rzk.observer;
/*
* 观察者接口
* */
public interface Observer {
    /**
     * 更新消息
     * @param msg
     */
    void update(String msg);
}
