package com.lemo.cmx.shengchanxiaofei;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/** wait() / nofity()方法是基类Object的两个方法
 * Created by 罗选通 on 2017/9/14.
 */
public class Storage {

  //仓库存储的产品
  List<Product> list= Lists.newLinkedList();
  //仓库最大存储数量
  private final Integer max=100;

  //生产个产品
  public void prduction(Product product) throws InterruptedException {
    synchronized (list){
      while (list.size()>=max){
        System.out.println("生产阻塞，当前仓库数量："+list.size());
        list.wait();//线程等待
      }
      list.add(product);
      list.add(product);
      list.add(product);
      System.out.println("生产成功，产品："+product.getName());
      list.notify();//唤醒其他线程
    }
  }

  //消费产品
  public void consumption() throws InterruptedException {
    synchronized (list){
      while(list.size()==0){
        System.out.println("消费阻塞，当前仓库数量："+list.size());
        list.wait();
      }
      Product remove = list.remove(new Random().nextInt(list.size()));
      System.out.println("消费成功，产品："+remove.getName());
      list.notify();
    }
  }

}
