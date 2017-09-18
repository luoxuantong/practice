package me.anmt.ssm.dao;

import me.anmt.ssm.pojo.User;

public interface UserDao {

    // 根据id查询用户信息
    public User queryUserById(Integer id);
}
