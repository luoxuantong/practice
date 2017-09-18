package me.anmt.ssm.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class BusinessAfterReturningAdvice implements AfterReturningAdvice {
  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
    String methodName = method.getName();  //得到方法名
    String targetClassName = o1.getClass().getName();//得到调用类名
    System.out.println(targetClassName+"."+methodName+"()");
    System.out.println("after excute target object...");
  }
}
