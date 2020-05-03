package com.rzk.Observer02;
//观察者2
public class UserObserver implements Observer {
    @Override
    public void handleNotify(Object message) {
        System.out.println("小明接收到："+message+"公众号推送来的提示");
    }
}
