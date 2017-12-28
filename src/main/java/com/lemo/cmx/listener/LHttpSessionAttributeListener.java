package com.lemo.cmx.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class LHttpSessionAttributeListener implements HttpSessionAttributeListener {
  @Override
  public void attributeAdded(HttpSessionBindingEvent se) {
    System.out.println(se.getSession());
    System.out.println(se.getName());
    System.out.println(se.getValue());
  }

  @Override
  public void attributeRemoved(HttpSessionBindingEvent se) {
    System.out.println(se.getSession());
    System.out.println(se.getName());
    System.out.println(se.getValue());
  }

  @Override
  public void attributeReplaced(HttpSessionBindingEvent se) {
    System.out.println(se.getSession());
    System.out.println(se.getName());
    System.out.println(se.getValue());
  }
}
