package com.rzk.Observer02;
//被观察者 -->公众号
public interface Subect {
    //发表文章 里面的括号（需要添加观察者也就是关注公众号的人）
    void pushArticle(Observer observer);
    //修改文章 里面的括号（需要添加观察者也就是关注公众号的人）
    void deleteArticle(Observer observer);
    //通知用户
    void notityUser(Object msg);
}
