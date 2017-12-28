package me.anmt.ssm.springlong;

/**
 * Created by 罗选通 on 2017/11/7.
 */
public class MessageProviderImpl implements MessageProvider {
  @Override
  public String queryForMessage(String name) {
    return "Hello, " + name;
  }
}
