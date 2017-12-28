package com.lemo.cmx.scheduled;

import org.springframework.stereotype.Component;

/**
 * Created by 罗选通 on 2017/11/13.
 */
@Component
public class TestScheduled {

  public void test(){
    for (int i=0;i<100;i++){
      System.out.println("TestScheduled:"+i);
    }
  }
}
