package me.anmt.ssm.redisp;

import java.io.Serializable;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class MessageUtil implements Serializable{
  private static final long serialVersionUID = -8785806144878640550L;
  private int id;
  private String content;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
}
