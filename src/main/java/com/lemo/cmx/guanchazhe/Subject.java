package com.lemo.cmx.guanchazhe;

/**主题（发布者、被观察者）
 * Created by 罗选通 on 2017/9/13.
 */
public interface Subject {
  /**
   * 注册观察者
   */
  void registerObserver(OBserver observer);

  /**
   * 移除观察者
   */
  void removeObserver(OBserver observer);

  /**
   * 通知观察者
   */
  void notifyObservers();

}
