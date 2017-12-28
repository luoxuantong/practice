package com.lemo.cmx.redisp;

import redis.clients.jedis.Jedis;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class Test {
  public static void main(String args[]) {
//
//    Jedis jedis = RedisPool.getJedis();
////    System.out.print(jedis.ping());
//    jedis.set("qq","ww");
////    jedis.del("qq");
//    jedis.flushAll();   //清空redis所有数据
//    System.out.println(jedis.get("qq"));

    final Jedis jedis = RedisPool.getJedis();
    String s = jedis.flushDB();
    System.out.println(s);
//    final MyListener listener = new MyListener();
//可以订阅多个频道
//订阅得到信息在lister的onMessage(...)方法中进行处理
//jedis.subscribe(listener, "channel1", "channel2");//订阅给定的一个或多个频道的信息。

//也用数组的方式设置多个频道
//jedis.subscribe(listener, new String[]{"channel3","channel4"});

//这里启动了订阅监听，线程将在这里被阻塞
//订阅得到信息在lister的onPMessage(...)方法中进行处理
    ///订阅一个或多个符合给定模式的频道。
//    jedis.psubscribe(listener, new String[]{"channel*"});//使用模式匹配的方式设置频道
//    List<String> strings = jedis.pubsubChannels("channel*");//查看订阅与发布系统状态。
//    jedis.publish("channel4","霄哥，霄哥");//将信息发送到指定的频道。
//    jedis.publish("channel3","霄哥，霄哥");
//    jedis.publish("channel4","霄哥，霄哥");//将信息发送到指定的频道。
//    jedis.publish("channel3","霄哥，霄哥");
//    jedis.publish("channel4","霄哥，霄哥");//将信息发送到指定的频道。
//    jedis.publish("channel3","霄哥，霄哥");
//    jedis.pubsubNumSub("channel3");//退订所有给定模式的频道。
//    System.out.println(strings);
  }
}
