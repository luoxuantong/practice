package me.anmt.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.anmt.ssm.dao.UserDao;
import me.anmt.ssm.pojo.User;
import me.anmt.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.queryUserById(id);
    }

}
