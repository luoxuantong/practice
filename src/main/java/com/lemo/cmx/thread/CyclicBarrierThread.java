package com.lemo.cmx.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class CyclicBarrierThread extends Thread {
  private CyclicBarrier cb;
  private int sleepSecond;

  public CyclicBarrierThread(CyclicBarrier cb, int sleepSecond) {
    this.cb = cb;
    this.sleepSecond = sleepSecond;
  }

  public void run() {
    try {
      System.out.println(this.getName() + "运行了");
      Thread.sleep(sleepSecond * 1000);//线程睡眠时间
      System.out.println(this.getName() + "准备等待了, 时间为" + System.currentTimeMillis());
      cb.await();
      System.out.println(this.getName() + "结束等待了, 时间为" + System.currentTimeMillis());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


  public static void main(String[] args) {
    Runnable runnable = new Runnable() {
      public void run() {
        System.out.println("CyclicBarrier的所有线程await()结束了，我运行了, 时间为" + System.currentTimeMillis());
      }
    };
    CyclicBarrier cb = new CyclicBarrier(3, runnable);
    CyclicBarrierThread cbt0 = new CyclicBarrierThread(cb, 3);
    CyclicBarrierThread cbt1 = new CyclicBarrierThread(cb, 6);
    CyclicBarrierThread cbt2 = new CyclicBarrierThread(cb, 9);
    cbt0.start();
    cbt1.start();
    cbt2.start();
  }
}
