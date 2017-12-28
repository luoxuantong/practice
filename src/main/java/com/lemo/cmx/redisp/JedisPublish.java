package com.lemo.cmx.redisp;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

/**
 * Created by 罗选通 on 2017/9/14.
 */
@Slf4j
public class JedisPublish {
  /**
   * 发布一个消息
   */
  public static void publishMsg(String channel, String message) {
    Jedis jedis = null;
    try {
      jedis = RedisPool.getJedis();
      jedis.publish(channel, message);
      log.debug("publishMsg {} = {}", channel, message);
    } catch (Exception e) {
      log.debug("publishMsg {} = {}", channel, e);
    } finally {
      RedisPool.returnResource(jedis);
    }
  }

  /**
   * 发布一个消息
   */
  public static void publishMsg(byte[] channel, byte[] message) {
    Jedis jedis = null;
    try {
      jedis = RedisPool.getJedis();
      jedis.publish(channel, message);
      log.debug("publishMsg {} = {}", channel, message);
    } catch (Exception e) {
      log.debug("publishMsg {} = {}", channel, e);
    } finally {
      RedisPool.returnResource(jedis);
    }
  }

}
