package com.rzk.Observer01;

import java.util.ArrayList;
import java.util.List;
//被观察者
public class AccountsSubject implements Subject {
    //声明观察者集合
    private List<Observer> obs;
    public AccountsSubject(){
        //被观察者对象创建的同时,就将观察者也创建
        obs = new ArrayList<>();
    }
    @Override
    public void addServer(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void removeServer(Observer ob) {
        obs.remove(ob);
    }

    public void notityServer(Object msg) {
        //通知每一个观察者
        for (Observer ob : obs) {
            ob.update(msg);
        }
    }
}
