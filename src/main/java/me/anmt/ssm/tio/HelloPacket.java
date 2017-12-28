package me.anmt.ssm.tio;

import org.tio.core.intf.Packet;

/**
 * Created by 罗选通 on 2017/12/25.
 */
public class HelloPacket extends Packet{
  private static final long serialVersionUID = -172060606924066412L;
  public static final int HEADER_LENGHT = 4;//消息头的长度
  public static final String CHARSET = "utf-8";
  private byte[] body;

  /**
   * @return the body
   */
  public byte[] getBody() {
    return body;
  }

  /**
   * @param body the body to set
   */
  public void setBody(byte[] body) {
    this.body = body;
  }
}
