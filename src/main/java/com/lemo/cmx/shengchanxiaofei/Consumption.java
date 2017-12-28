package com.lemo.cmx.shengchanxiaofei;

/** 消费者
 * Created by 罗选通 on 2017/9/14.
 */
public class Consumption extends Thread {

  private Storage2 storage;

  public Consumption(Storage2 storage) {
    this.storage = storage;
  }

  @Override
  public void run() {
    super.run();
    try {
      storage.consumption();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
