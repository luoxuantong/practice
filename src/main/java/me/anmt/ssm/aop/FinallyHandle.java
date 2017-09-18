package me.anmt.ssm.aop;

import org.aspectj.lang.JoinPoint;
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
    redisProducer.sendMessage("java",joinPoint.getArgs());
  }
}
