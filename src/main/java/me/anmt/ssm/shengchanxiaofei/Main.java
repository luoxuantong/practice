package me.anmt.ssm.shengchanxiaofei;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class Main {

  public static void main(String[] a) {

    //产品
    Product product=new Product(10010,"羅選通");
    Product product1=new Product(10011,"羅選通1");
    //仓库
    Storage2 storage = new Storage2();
    //生产者
    Prduction prduction = new Prduction(storage, product);
    Prduction prduction1 = new Prduction(storage, product1);
    //消费者
    Consumption consumption = new Consumption(storage);
    Consumption consumption1 = new Consumption(storage);
    consumption.start();
    consumption1.start();
    prduction.start();
    prduction1.start();

  }
}
