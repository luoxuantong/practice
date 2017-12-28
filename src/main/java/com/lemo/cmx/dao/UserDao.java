package com.lemo.cmx.dao;

import com.lemo.cmx.pojo.User;

public interface UserDao {

    // 根据id查询用户信息
    User queryUserById(Integer id);

  int insert(User user);
  int deleteById(int id);
}
