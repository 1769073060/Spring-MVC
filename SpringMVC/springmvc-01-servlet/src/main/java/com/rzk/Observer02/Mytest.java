package com.rzk.Observer02;

import com.rzk.Observer01.AccountsSubject;

public class Mytest {
    public static void main(String[] args) {
        //创建多个观察者
        UserObserver o1 = new UserObserver();
        User2Observer o2 = new User2Observer();

        //创建被观察者
        Subect s = new AccountsSubect();

        s.pushArticle(o1);
        s.pushArticle(o2);

        //删除推送
//        s.deleteArticle(o1);
        //通知
        s.notityUser("{小米官方}");

    }
}
