package com.lemo.cmx.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 罗选通 on 2017/9/19.
 */
public class Provider {
  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo/provider.xml"});
    context.start();
    System.in.read(); // 按任意键退出
  }
}
