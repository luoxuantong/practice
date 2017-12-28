package com.lemo.cmx.zerenlian;

/**
 * Created by 罗选通 on 2017/12/26.
 */
public class MyHandler extends AbstractHandler implements Handler {
  private String name;

  public MyHandler(String name) {
    this.name = name;
  }
  @Override
  public void operator() {
    System.out.println(name);
    if (getHandler() != null) {
      getHandler().operator();
    }
  }
}
