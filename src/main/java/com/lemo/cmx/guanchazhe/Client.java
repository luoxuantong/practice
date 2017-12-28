package com.lemo.cmx.guanchazhe;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class Client {
  public static void main(String[] args) {
    Subject subject=new SubjectImpl();
    //创建微信用户
    OBserver observer=new ObServerImpl("杨影枫");
    OBserver observer2=new ObServerImpl("月眉儿");
    OBserver observer3=new ObServerImpl("紫轩");
    //订阅公众号
    subject.registerObserver(observer);
    subject.registerObserver(observer2);
    subject.registerObserver(observer3);
    //公众号更新发出消息给订阅的微信用户
    subject.notifyObservers();
  }
}
