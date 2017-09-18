package me.anmt.ssm.utils;

import java.util.List;

import me.anmt.ssm.redisp.RedisPool;
import redis.clients.jedis.Jedis;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class JedisUtil {
  private static Jedis jedis = null;

  /**
   * 存储REDIS队列 顺序存储
   *
   * @param key   字节类型
   * @param value 字节类型
   */
  public static void lpush(byte[] key, byte[] value) {
    try {
      jedis = RedisPool.getJedis();
      jedis.lpush(key, value);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      RedisPool.returnResource(jedis);
    }
  }

  /**
   * 存储REDIS队列 反序存储
   *
   * @param key   字节类型
   * @param value 字节类型
   */
  public static void rpush(byte[] key, byte[] value) {
    try {
      jedis = RedisPool.getJedis();
      jedis.rpush(key, value);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      RedisPool.returnResource(jedis);
    }
  }

  /**
   * 移除列表的最后一个元素，并将该元素添加到另一个列表并返回,就可以实现任务队列
   *
   * @param srckey 原队列的key
   * @param dstkey 目标队列的key
   */
  public static byte[] rpoplpush(byte[] srckey, byte[] dstkey) {
    byte[] value = null;
    try {
      jedis = RedisPool.getJedis();
      value = jedis.rpoplpush(srckey, dstkey);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      RedisPool.returnResource(jedis);
    }
    return value;
  }

  /**
   * 从列表中弹出一个值，将弹出的元素插入到另外一个列表中并返回它； 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止。
   */
  public static byte[] brpoplpush(byte[] srckey, byte[] dstkey, int timout) {
    byte[] value = null;
    try {
      jedis = RedisPool.getJedis();
      value = jedis.brpoplpush(srckey, dstkey, timout);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      RedisPool.returnResource(jedis);
    }
    return value;
  }

  /**
   * 设置实现任务队列的键和过期时间
   */
  public static List<byte[]> brpop(byte[] key, int timeout) {
    List<byte[]> result = null;
    try {
      jedis = RedisPool.getJedis();
      result = jedis.brpop(0, key);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      RedisPool.returnResource(jedis);
    }
    return result;
  }

  /**
   * 移除队列中的最后一个元素并显示最后一个元素
   */
  public static byte[] rpop(byte[] key) {
    byte[] bytes = null;
    try {
      jedis = RedisPool.getJedis();
      bytes = jedis.rpop(key);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      RedisPool.returnResource(jedis);
    }
    return bytes;
  }
}
