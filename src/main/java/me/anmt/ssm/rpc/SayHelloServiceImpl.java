package me.anmt.ssm.rpc;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class SayHelloServiceImpl implements SayHelloService
{
  /**
   * @Description 问好
   * @Author 罗选通
   * @Date 2017/11/8 10:34
   * @method
   */
  @Override
  public String sayHello(String s) {
    if("hello".equals(s)){
      return "hello";
    }
    return "bey";
  }
}
