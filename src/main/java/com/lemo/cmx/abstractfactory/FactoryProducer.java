package com.lemo.cmx.abstractfactory;

/**
 * <P>
 *   工厂类的工厂类
 * </P>
 * @author 杨浩
 * @create 2017-12-27 13:54
 */
public class FactoryProducer {

  public static AbstractFactory getColorFactory() {
    return new ColorFactory();
  }

  public static AbstractFactory getShapeFactory() {
    return new ShapeFactory();
  }
}