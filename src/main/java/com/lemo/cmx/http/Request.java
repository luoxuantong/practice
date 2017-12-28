package com.lemo.cmx.http;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class Request {
  /**
   * 协议编码
   */
  private byte[] encode;
  /**
   * 命令
   */
  private String commend;
  /**
   * 命令长度
   */
  private int commandLength;

  public byte[] getEncode() {
    return encode;
  }

  public void setEncode(byte[] encode) {
    this.encode = encode;
  }

  public String getCommend() {
    return commend;
  }

  public void setCommend(String commend) {
    this.commend = commend;
  }

  public int getCommandLength() {
    return commandLength;
  }

  public void setCommandLength(int commandLength) {
    this.commandLength = commandLength;
  }
}
