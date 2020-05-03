package com.rzk.observer;

public class ObserverPerson implements Observer {
    private String name;
    //这个具体的观察者订阅的主题
    private Subject subject;

    public ObserverPerson(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.registObserver(this);
    }

    @Override
    public void update(String msg ) {
        System.out.println(name+msg);
    }
}
