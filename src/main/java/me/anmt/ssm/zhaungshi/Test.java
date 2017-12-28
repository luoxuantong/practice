package me.anmt.ssm.zhaungshi;

/**
 * Created by ??? on 2017/9/26.
 */
public class Test {
  public static void main(String[] args) {
//    Man man = new Man();
//    ManDecoratorA md1 = new ManDecoratorA();
//    ManDecoratorB md2 = new ManDecoratorB();
//
//    md1.setPerson(man);
//    md2.setPerson(md1);
//    md2.eat();
//    System.out.println("??");



    IBread bread=new NormalBread();
    bread=new SweetDecorator(bread);
    bread=new CornDecorator(bread);
    bread.process();




  }
}
