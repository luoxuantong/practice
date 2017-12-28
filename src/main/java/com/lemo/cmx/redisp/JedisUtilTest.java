package com.lemo.cmx.redisp;

import com.lemo.cmx.utils.JedisUtil;
import com.lemo.cmx.utils.SerialoizebleUtil;

import redis.clients.jedis.Jedis;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class JedisUtilTest {
  public static byte[] rediskey = "key".getBytes();
  public static byte[] dstkey = "dstkey".getBytes();
  public static long time = 0;

  public static void main(String args[]) {
    Jedis jedis = RedisPool.getJedis();
    while (true) {
      try {
        byte[] bytes = JedisUtil.brpoplpush(rediskey, dstkey, 0);
        MessageUtil msg = (MessageUtil) SerialoizebleUtil.unSerialize(bytes);
        if (msg != null) {
          System.out.println(msg.getId() + " " + msg.getContent());
        }
        time = 3000;
        System.out.println(jedis.lrange(rediskey, 0, 100));
        System.out.println(jedis.lrange(dstkey, 0, 100));
        Thread.sleep(time);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
