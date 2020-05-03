package com.rzk.observer;

public class Mytest {
    public static void main(String[] args) {
        Sport3DSubject subject = new Sport3DSubject();

        ObserverPerson ob1 = new ObserverPerson("小明",subject);
        ObserverPerson ob2 = new ObserverPerson("小红",subject);
        ObserverPerson ob3 = new ObserverPerson("小黑",subject);

        subject.removeObserver(ob1);

        subject.setMsg("同学我向您发送一则报告");

    }
}
