package com.lemo.cmx.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class Test {

  public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:aop/aop-schema.xml");
    IBaseBusiness baseBusiness=(IBaseBusiness)context.getBean("businessProxy");
    baseBusiness.stop("w");
  }
}
