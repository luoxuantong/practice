package me.anmt.ssm.guanchazhe;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class ObServerImpl implements OBserver {

  private String name;
  public ObServerImpl(String name){
    this.name=name;
  }
  @Override
  public void update() {
    System.out.println("观察者 "+name+" 更新");
  }
}
