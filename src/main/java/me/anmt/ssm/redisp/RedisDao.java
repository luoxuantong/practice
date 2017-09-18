package me.anmt.ssm.redisp;

import java.util.List;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public interface RedisDao {
  public boolean RedisExist(Object key);

  public void RedisSet(Object key, Object value);

  public Object RedisGet(Object key);

  public Object RedisGetSet(Object key, Object value);

  public void RedisMset(Object... keysvalues);

  public List<Object> RedisMget(Object... keys);

  public void RedisSetex(Object key, int seconds, Object value);

  public void RedisExpire(Object key, int seconds);

  public void RedisPersist(Object key);

  public Long RedisTTL(Object key);

  public void RedisDel(Object... keys);

  public void RedisRename(Object key, Object newkey);
}
