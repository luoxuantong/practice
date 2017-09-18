package me.anmt.ssm.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class onLineCount implements HttpSessionListener {
  public int count=0;//记录session的数量

  @Override
  public void sessionCreated(HttpSessionEvent se) {
    count++;
    se.getSession().getServletContext().setAttribute("count",count);
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent se) {
    count--;
    se.getSession().getServletContext().setAttribute("count", count);
  }
}
