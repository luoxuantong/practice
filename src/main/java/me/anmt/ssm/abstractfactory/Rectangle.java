package me.anmt.ssm.abstractfactory;

/**<p>
 * 子类
 * </p>
 * @author 杨浩
 * @create 2017-12-26 15:41
 */
public class Rectangle implements Shape{

  public Rectangle(){
    System.out.println("Rectangle");
  }

  @Override
  public void draw() {}
}