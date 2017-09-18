package service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import base.BaseRunner;
import me.anmt.ssm.pojo.User;
import me.anmt.ssm.service.UserService;

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
