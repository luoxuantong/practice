package me.anmt.ssm.http;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class Response {
  /**
   * 编码
   */
  private byte[] encode;
  /**
   * 响应长度
   */
  private int responseLength;
  /**
   * 响应
   */
  private String response;

  public byte[] getEncode() {
    return encode;
  }

  public void setEncode(byte[] encode) {
    this.encode = encode;
  }

  public int getResponseLength() {
    return responseLength;
  }

  public void setResponseLength(int responseLength) {
    this.responseLength = responseLength;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }
}
