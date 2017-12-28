package com.lemo.cmx.dubbo;

/**
 * Created by 罗选通 on 2017/9/19.
 */
public class DemoServiceImpl implements DemoService {
  public String sayHello(String name) {
    return "Hello " + name;
  }
}
