package service;

import com.lemo.cmx.pojo.User;
import com.lemo.cmx.service.UserService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import base.BaseRunner;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class UserServiceTest extends BaseRunner {

  @Autowired
  private UserService userService;
  @Test
  public void getUserByIdTest(){
    User userById = userService.getUserById(1);
  }
}
