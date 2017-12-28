package com.lemo.cmx.redisp;

import java.util.ResourceBundle;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class RedisPool {

  private static JedisPool pool =null;
  /*使用静态代码块，优先加载顺序在static方法之前
   * 初始化redis连接配置
   */
  static {
    //得到redis.properties 中的配置信息
    ResourceBundle bundle = ResourceBundle.getBundle("redis/redis");
    if(bundle==null){
      throw new IllegalArgumentException("[redisp.properties] is not found");
    }
    //配置信息对象config
    JedisPoolConfig config = new JedisPoolConfig();
    config.setMaxTotal(Integer.valueOf(bundle.getString("redis.maxActive")));
    config.setMaxIdle(Integer.valueOf(bundle.getString("redis.maxIdle")));
    config.setMaxWaitMillis(Long.valueOf(bundle.getString("redis.maxWait")));
    config.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.testOnBorrow")));
//    config.setTestOnReturn(Boolean.valueOf(bundle.getString("redisp.testOnReturn")));
    //创建redis连接池
    pool =  new JedisPool( config,bundle.getString("redis.host"),Integer.valueOf(bundle.getString("redis.port")),1000,bundle.getString("redis.pass"));
  }
  /**
   * 获取jedis实例
   * 在获取jedis实例方法前，加上序列化
   */
  public synchronized static Jedis getJedis(){
    if(pool!=null){
      return pool.getResource();
    }else{
      return null;
    }
  }
  /**
   * 释放jedis实例资源
   */
  public static void returnResource(Jedis jedis){
    if(jedis!=null){
      jedis.close();
    }
  }
}
