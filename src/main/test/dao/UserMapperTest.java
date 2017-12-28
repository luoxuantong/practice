package dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import base.BaseRunner;
import me.anmt.ssm.dao.UserDao;

/**
 * Created by 罗选通 on 2017/9/18.
 */
public class UserMapperTest extends BaseRunner {

  @Autowired
  private UserDao userDao;

  @Test
  @Rollback(false)
  public void getUserByIdTest() {
    Integer rs = userDao.deleteById(1);
    System.out.println(rs);
  }
}
