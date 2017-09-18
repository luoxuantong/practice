package me.anmt.ssm.aop;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.NameMatchMethodPointcut;

import java.lang.reflect.Method;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class PointMatcher extends NameMatchMethodPointcut {
  @Override
  public boolean matches(Method method, Class<?> aClass) {
    //设置单个方法匹配
    this.setMappedName("delete");
    //设置多个方法匹配
    String[] methods={"delete","modify"};
    this.setMappedNames(methods);
    return super.matches(method,aClass);
  }

  //定义对什么类有效
  @Override
  public ClassFilter getClassFilter() {
    return new ClassFilter() {
      public boolean matches(Class<?> aClass) {
        //定义对UserService类或者它的派生类有效
//        return UserService.class.isAssignableFrom(aClass);
        return true;
      }
    };
  }
}
