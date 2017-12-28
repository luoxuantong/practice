package me.anmt.ssm.zhaungshi;

/**
 * Created by ???? on 2017/9/26.
 */
public class Main {
  public static void main(String[] args) {
    Man man = new Man();
    ManDecoratorA md1 = new ManDecoratorA();
    ManDecoratorB md2 = new ManDecoratorB();

    md1.setPerson(man);
    md2.setPerson(md1);
    md2.eat();
    System.out.println("中文");
  }
}
