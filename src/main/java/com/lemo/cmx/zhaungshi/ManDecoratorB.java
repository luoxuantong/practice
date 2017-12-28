package com.lemo.cmx.zhaungshi;

/**
 * Created by 罗选通 on 2017/9/26.
 */
public class ManDecoratorB extends Decorator {
  public void eat() {
    super.eat();
    System.out.println("===============");
    System.out.println("ManDecoratorB");
  }
}
