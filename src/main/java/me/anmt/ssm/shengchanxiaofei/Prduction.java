package me.anmt.ssm.shengchanxiaofei;

/**
 * Created by 罗选通 on 2017/9/14.
 */
public class Prduction extends Thread {

  private Storage2 storage;

  private Product product;

  public Prduction(Storage2 storage,Product product) {
    this.storage = storage;
    this.product=product;
  }



  @Override
  public void run() {
    super.run();
    try {
      storage.prduction(product);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
