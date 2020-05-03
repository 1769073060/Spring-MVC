package com.rzk.Observer01;

public class UserObserver implements Observer {

    @Override
    public void update(Object ob) {
        System.out.println("小明接收到消息"+ob+"已读");
    }
}
