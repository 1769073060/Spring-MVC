package com.rzk.Observer01;

public class Mytest {
    public static void main(String[] args) {


        //创建多个观察者
        Observer observer1 = new UserObserver();
        Observer observer2 = new User2Observer();

        //创建被观察者
        Subject subject = new AccountsSubject();
        //被观察者添加观察者
        subject.addServer(observer1);
        subject.addServer(observer2);
        //被观察者向所有观察者发送消息
        subject.notityServer("{公众号}");
    }
}