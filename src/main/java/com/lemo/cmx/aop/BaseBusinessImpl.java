package com.lemo.cmx.aop;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class BaseBusinessImpl implements IBaseBusiness {
  @Override
  public void start(String par) {
    System.out.println("start方法启动，参数：" + par);
  }

  @Override
  public void stop(String par) {
    System.out.println("stop方法启动，参数：" + par);
  }
}
