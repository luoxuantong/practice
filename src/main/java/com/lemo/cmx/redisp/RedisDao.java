package com.lemo.cmx.redisp;

import java.util.List;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public interface RedisDao {
  boolean RedisExist(Object key);

  void RedisSet(Object key, Object value);

  Object RedisGet(Object key);

  Object RedisGetSet(Object key, Object value);

  void RedisMset(Object... keysvalues);

  List<Object> RedisMget(Object... keys);

  void RedisSetex(Object key, int seconds, Object value);

  void RedisExpire(Object key, int seconds);

  void RedisPersist(Object key);

  Long RedisTTL(Object key);

  void RedisDel(Object... keys);

  void RedisRename(Object key, Object newkey);
}
