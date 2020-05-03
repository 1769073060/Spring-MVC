package com.rzk.Observer01;

public class User2Observer implements Observer {
    @Override
    public void update(Object ob) {
        System.out.println("小红接收到消息"+ob+"已读");
    }
}
