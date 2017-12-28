package com.lemo.cmx.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class BusinessThrowsAdvice implements ThrowsAdvice {
  public void afterThrowing(NullPointerException e) {//可以定义多个方法，只要传入的参数是不同异常
    System.out.print("not load anything goods!");
  }

  public void afterThrowing(IllegalArgumentException e) {//可以定义多个方法，只要传入的参数是不同异常
    System.out.print("load a tiger,it's very much dangerous!");
  }
}
