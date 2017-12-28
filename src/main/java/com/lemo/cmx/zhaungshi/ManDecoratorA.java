package com.lemo.cmx.zhaungshi;

/**
 * Created by 罗选通 on 2017/9/26.
 */
public class ManDecoratorA extends Decorator {
  public void eat() {
    super.eat();
    reEat();
    System.out.println("ManDecoratorA");
  }

  public void reEat() {
    System.out.println("ManDecoratorA again eat");
  }
}
