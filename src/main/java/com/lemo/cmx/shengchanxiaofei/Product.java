package com.lemo.cmx.shengchanxiaofei;

/**产品
 * Created by 罗选通 on 2017/9/14.
 */
public class Product {

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private String name;

  public Product(Integer id, String name) {
    this.id = id;
    this.name = name;
  }
}
