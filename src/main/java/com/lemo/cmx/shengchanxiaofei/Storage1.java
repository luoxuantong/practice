package com.lemo.cmx.shengchanxiaofei;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** await() / signal()方法
 * Created by 罗选通 on 2017/9/14.
 */
public class Storage1 {

  //仓库存储的产品
  private List<Product> list= Lists.newLinkedList();
  //仓库最大存储数量
  private final Integer max=100;

  Lock lock=new ReentrantLock();
  //状态
  private Condition full=lock.newCondition();

  private Condition empty=lock.newCondition();


  //生产产品
  public void prduction(Product product) throws InterruptedException {
    //获得锁
    lock.lock();
      while (list.size()>=max){
        System.out.println("生产阻塞，当前仓库数量："+list.size());
        full.await();//线程等待
      }
      list.add(product);
      list.add(product);
      list.add(product);
      System.out.println("生产成功，产品："+product.getName());
      empty.signalAll();
      full.signalAll();//唤醒其他线程
    lock.unlock();
  }

  //消费产品
  public void consumption() throws InterruptedException {
    lock.lock();
      while(list.size()==0){
        System.out.println("消费阻塞，当前仓库数量："+list.size());
        empty.await();
      }
      Product remove = list.remove(new Random().nextInt(list.size()));
      System.out.println("消费成功，产品："+remove.getName());
    empty.signalAll();
    full.signalAll();
    lock.unlock();
  }

}
