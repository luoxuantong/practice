package com.lemo.cmx.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class LServletRequestListener implements ServletRequestListener {
  @Override
  public void requestDestroyed(ServletRequestEvent sre) {
    System.out.println(sre.getServletRequest().getServerName());
  }

  @Override
  public void requestInitialized(ServletRequestEvent sre) {
    System.out.println(sre.getServletRequest().getServerName());
  }
}
