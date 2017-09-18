package me.anmt.ssm.redisp;

import redis.clients.jedis.JedisPubSub;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class MyListener extends JedisPubSub {
  // 取得订阅的消息后的处理
  public void onMessage(String channel, String message) {
    System.out.println("onMessage="+channel + "=" + message);
  }

  // 初始化订阅时候的处理
  public void onSubscribe(String channel, int subscribedChannels) {
     System.out.println("onSubscribe="+channel + "=" + subscribedChannels);
  }

  // 取消订阅时候的处理
  public void onUnsubscribe(String channel, int subscribedChannels) {
     System.out.println("onUnsubscribe="+channel + "=" + subscribedChannels);
  }

  // 初始化按表达式的方式订阅时候的处理
  public void onPSubscribe(String pattern, int subscribedChannels) {
     System.out.println("onPSubscribe="+pattern + "=" + subscribedChannels);
  }

  // 取消按表达式的方式订阅时候的处理
  public void onPUnsubscribe(String pattern, int subscribedChannels) {
     System.out.println("onPUnsubscribe="+pattern + "=" + subscribedChannels);
  }

  // 取得按表达式的方式订阅的消息后的处理
  public void onPMessage(String pattern, String channel, String message) {
    System.out.println("onPMessage="+pattern + "=" + channel + "=" + message);
  }
}
