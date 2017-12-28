package com.lemo.cmx.abstractfactory;

/**
 * @author 杨浩
 * @create 2017-12-27 13:51
 */
public class ShapeFactory extends AbstractFactory{

  public Shape getSquare(){
    return new Square();
  }

  public Shape getRectangle(){
    return new Rectangle();
  }
}