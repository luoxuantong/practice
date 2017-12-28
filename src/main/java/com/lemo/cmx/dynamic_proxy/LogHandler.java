package com.lemo.cmx.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Created by 罗选通 on 2017/9/13.
 */
public class LogHandler implements InvocationHandler {

  private Object targetObject;

  public Object newProxyInstance(Object targetObject){
    this.targetObject=targetObject;
    return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("开始执行！");
    for(int i=0;i<args.length;i++){
      System.out.println(args[i]);
    }
    Object ret = null;
    try{
      //调用目标方法
      ret = method.invoke(targetObject, args);
      System.out.println("执行成功！");
    }catch(Exception e){
      e.printStackTrace();
      System.out.println("执行失败！");
      throw e;
    }
    return ret;
  }
}
