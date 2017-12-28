package me.anmt.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import me.anmt.ssm.redisp.RedisProducer;

/**
 * Created by 罗选通 on 2017/9/15.
 */
@Aspect
public class FinallyHandle {

  @Autowired
  private RedisProducer redisProducer;

  @Pointcut("execution(* me.anmt.ssm.controller.*.*(..))")
  public void fhpointcut(){

  }

  @Before(value = "fhpointcut()")
  public void doBefoer(JoinPoint joinPoint){
    for (int i = 0; i < joinPoint.getArgs().length; i++) {
      System.out.println(joinPoint.getArgs()[i]);
    }
    System.out.println(joinPoint.getSignature().getName());
//    redisProducer.sendMessage("java",joinPoint.getArgs());
  }
  @AfterReturning(pointcut = "fhpointcut()", returning = "result")//声明后置通知
  public void doAfterReturning(String result) {
    System.out.println("后置通知");
    System.out.println("---" + result + "---");
  }

  @AfterThrowing(pointcut = "fhpointcut()", throwing = "e")//声明例外通知
  public void doAfterThrowing(Exception e) {
    System.out.println("例外通知");
    System.out.println(e.getMessage());
  }

  @After("fhpointcut()")//声明最终通知
  public void doAfter() {
    System.out.println("最终通知");
  }

  @Around("fhpointcut()")//声明环绕通知
  public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("进入方法---环绕通知");
    //显示调用，确保被代理的方法被调用
    Object o = pjp.proceed();
    System.out.println("退出方法---环绕通知");
    return o;
  }
}
