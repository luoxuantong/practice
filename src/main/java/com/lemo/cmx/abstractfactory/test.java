package com.lemo.cmx.abstractfactory;

/**
 * @author 杨浩
 * @create 2017-12-27 13:57
 */
public class test {

  public static void main(String[] args) {
    ColorFactory colorFactory = (ColorFactory) FactoryProducer.getColorFactory();
    colorFactory.getRed();
  }
}