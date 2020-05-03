package com.rzk.Observer02;

import com.rzk.Observer01.AccountsSubject;

import java.util.ArrayList;
import java.util.List;
/*
被观察者
*/

public class AccountsSubect implements Subect {
    private List<Observer> ob;
    //创建一个无参  使得被观察者一创建，观察者也能一起被创建
    public AccountsSubect(){
        ob = new ArrayList<>();
    }


    @Override
    public void pushArticle(Observer observer) {
        ob.add(observer);
    }

    @Override
    public void deleteArticle(Observer observer) {
        //判斷是否有這個人
        if (ob.contains(observer)) {
            ob.remove(observer);
        }
    }
//    @Override
    public void notityUser(Object msg) {
        //通知每一个观察者
        for (Observer observer : ob) {
            observer.handleNotify(msg);
        }
    }
}
