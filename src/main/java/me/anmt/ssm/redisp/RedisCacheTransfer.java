package me.anmt.ssm.redisp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class RedisCacheTransfer {
  @Autowired
  public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
    RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
  }
}
