package me.anmt.ssm.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class BusinessAroundAdvice implements MethodInterceptor {
  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    System.out.println("before around excute target object...");
    String methodName = invocation.getMethod().getName();  //得到方法名
    String targetClassName = invocation.getClass().getName();//得到调用类名
    System.out.println(targetClassName+"."+methodName+"()");
    Object result = invocation.proceed(); //调用横切点，即真实操作
    System.out.println("after around excute target object...");
    return result;  }
}
