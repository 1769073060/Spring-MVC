package com.rzk.observer;

/*
* 被观察接口
* */
public interface Subject {
    /**
     * 注册观察者
     * @param ob
     */
    void registObserver(Observer ob);

    /**
     * 取消观察者
     * @param ob
     */
    void removeObserver(Observer ob);

    /**
     * 通知观察者
     */
    void notifyObserver();

}
