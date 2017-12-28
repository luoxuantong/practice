package com.lemo.cmx.redisp;

import com.lemo.cmx.utils.JedisUtil;
import com.lemo.cmx.utils.SerialoizebleUtil;

import redis.clients.jedis.Jedis;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class initList {

  public static byte[] rediskey = "key".getBytes();
  public static byte[] dstkey = "dstkey".getBytes();
  public static long time=0;
  public static int i=0;
  public static void main(String args[]) {
    Jedis jedis = RedisPool.getJedis();
//    byte[] lpop = jedis.lpop(rediskey);
//    MessageUtil o = (MessageUtil)SerialoizebleUtil.unSerialize(lpop);
//    System.out.println(o.getContent());

    while (true){
      try {
        MessageUtil msg1 = new MessageUtil();
        msg1.setId(i);
        msg1.setContent("wq"+i);
        JedisUtil.lpush(rediskey, SerialoizebleUtil.serialize(msg1));
        time=2000;
        System.out.println("success"+i);
        System.out.println(jedis.lrange(rediskey,0,100));
        i++;
        Thread.sleep(time);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
