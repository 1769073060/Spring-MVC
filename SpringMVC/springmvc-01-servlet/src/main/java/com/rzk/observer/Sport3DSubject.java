package com.rzk.observer;

import java.util.ArrayList;
import java.util.List;

public class Sport3DSubject implements Subject {
    private String msg;
    public void setMsg(String msg){
        this.msg=msg;
        notifyObserver();
    }
//    定义一个有地方存储观察者的对象
   private List<Observer> observers= new ArrayList<>();

    /**
     * 可以注册观察者
     * @param ob
     */
    @Override
    public void registObserver(Observer ob) {
            //添加观察者
        observers.add(ob);
    }

    /**
     * 删除
     * @param ob
     */
    @Override
    public void removeObserver(Observer ob) {
        //校验这个观察者有没有在集合中
        int index = observers.indexOf(ob);
        if (index>0){
            observers.remove(index);
        }
    }

    /**
     * 通知观察者
     *
     */
    @Override
    public void notifyObserver() {
        //遍历观察者
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
