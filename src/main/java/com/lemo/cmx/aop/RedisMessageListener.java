package com.lemo.cmx.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;

/**
 * Created by 罗选通 on 2017/9/16.
 */
@Component
public class RedisMessageListener implements MessageListener {

  @Autowired
  RedisTemplate redisTemplate;

  RedisSerializer<String> serializer;

  public void setSerializer(RedisSerializer serializer) {
    this.serializer = serializer;
  }

  @Override
  public void onMessage(Message message, byte[] pattern) {
    serializer = redisTemplate.getValueSerializer();
    String deserialize = serializer.deserialize(message.getBody());
    System.out.println("message received:" + deserialize);
  }
}
