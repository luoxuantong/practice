package com.lemo.cmx.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class InitServletContextListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    System.out.println("加载业务字典");
    try {
      System.out.println("1111111111111");
    } catch (Exception e) {
      System.out.println("加载业务字典失败！");
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {
    System.out.println("InitServletContextListener銷毀");
  }
}
