package com.lemo.cmx.redisp;

import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;

/**
 * Created by 罗选通 on 2017/9/15.
 */
public class RedisProducer {

  private RedisTemplate redisTemplate;


  public void setRedisTemplate(RedisTemplate redisTemplate) {
    this.redisTemplate = redisTemplate;
  }

  public void sendMessage(String channel, Serializable message) {
    redisTemplate.convertAndSend(channel, message);
  }
}
