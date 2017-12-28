package me.anmt.ssm.abstractfactory;

/**
 * <p>
 *   Color工厂类
 * </p>
 * @author 杨浩
 * @create 2017-12-27 13:46
 */
public class ColorFactory extends AbstractFactory{

  public Color getRed(){
    return new RedColor();
  }

  public Color GreenColor(){
    return new GreenColor();
  }
}