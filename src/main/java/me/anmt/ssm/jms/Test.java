package me.anmt.ssm.jms;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 罗选通 on 2017/9/15.
 */
public class Test {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:jms/jms.xml");
    Producer producer = (Producer) context.getBean("producer");
//    producer.queue();
    producer.topic();
  }
}
