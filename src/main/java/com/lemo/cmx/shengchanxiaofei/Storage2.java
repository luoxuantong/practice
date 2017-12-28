package com.lemo.cmx.shengchanxiaofei;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class Storage2 {

  //仓库存储的产品
  private BlockingDeque<Product> list= new LinkedBlockingDeque<>();
  //仓库最大存储数量
  private final Integer max=100;


  //生产产品
  public void prduction(Product product) throws InterruptedException {
    //获得锁
    if (list.size()>=max){
      System.out.println("生产阻塞，当前仓库数量："+list.size());
    }
    list.put(product);
    System.out.println("生产成功，产品："+product.getName());

  }

  //消费产品
  public void consumption() throws InterruptedException {
    if(list.size()==0){
      System.out.println("消费阻塞，当前仓库数量："+list.size());
    }
    Product take = list.take();
    System.out.println("消费成功，产品："+take.getName());
  }
}
