package com.rzk.Observer02;
//观察者
public class User2Observer implements Observer {
    @Override
    public void handleNotify(Object message) {
        System.out.println("小红也接收到："+message+"公众号推送来的提示");
    }
}
