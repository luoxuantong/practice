package com.lemo.cmx.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class BusinessBeforeAdvice implements MethodBeforeAdvice {
  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("before excute target object...");
    String methodName = method.getName();  //得到方法名
    String targetClassName = o.getClass().getName();//得到调用类名
    System.out.println(targetClassName+"."+methodName+"()");
  }
}
