package me.anmt.ssm.redisp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 罗选通 on 2017/9/15.
 */
public class TestRedisConsumer {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:redis/redis.xml");

    RedisProducer redisProducer = (RedisProducer) context.getBean("redisProducer");
    redisProducer.sendMessage("java",new Integer[]{21341,123123,12323});

//    MessageDelegateListener messageDelegateListener = (MessageDelegateListener) context.getBean("messageDelegateListener");
//    System.out.println("消费者1");
//    while (true) { //这里是一个死循环,目的就是让进程不退出,用于接收发布的消息
//      try {
//        Thread.sleep(3000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//    }
  }
}
