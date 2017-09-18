package me.anmt.ssm.redisp;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/** 接收消息的Listener,用于接收订阅到的消息.
 * Created by 罗选通 on 2017/9/15.
 */
public class MessageDelegateListener {

  /**
   * @Description 默认监听方法handleMessage
   * @Author 罗选通
   * @Date 2017/9/15 18:15
   * @method
   */
  public void handleMessage(Serializable message) {
    if (message == null) {
      System.out.println("null");
    } else if (message.getClass().isArray()) {
      System.out.println(Arrays.toString((Object[]) message));
    } else if (message instanceof List<?>) {
      System.out.println(message);
    } else if (message instanceof Map<?, ?>) {
      System.out.println(message);
    } else {
      System.out.println(ToStringBuilder.reflectionToString(message));
    }
  }
}
