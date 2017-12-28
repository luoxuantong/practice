package com.lemo.cmx.redisp;

import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * Created by 罗选通 on 2017/9/19.
 */
public class Brpop {
  public static void main(String[] a){
    Jedis jedis = RedisPool.getJedis();
    assert jedis != null;
    List<String> brpop = jedis.blpop("123","1");
    System.out.println(brpop);
  }
}
