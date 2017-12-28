package object;

import java.lang.reflect.Field;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by 罗选通 on 2017/10/26.
 */
@Slf4j
public class Test {

  @org.junit.Test
  public void test() throws IllegalAccessException {
    User user = new User();
    boolean flag = false;
    for (Field f : user.getClass().getDeclaredFields()) {
      f.setAccessible(true);
      log.info(f.getName());
      if (f.get(user) == null) {
        flag = true;
      }
    }
    System.out.println(false);
  }
}
