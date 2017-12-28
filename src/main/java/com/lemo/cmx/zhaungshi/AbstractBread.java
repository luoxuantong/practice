package com.lemo.cmx.zhaungshi;

/**
 * Created by 罗选通 on 2017/9/26.
 */
public abstract class AbstractBread implements IBread {
  private final IBread bread;

  public AbstractBread(IBread bread) {
    super();
    this.bread = bread;
  }

  @Override
  public void prepair() {
    this.bread.prepair();
  }

  @Override
  public void kneadFlour() {
    this.bread.kneadFlour();
  }

  @Override
  public void steamed() {
    this.bread.steamed();
  }

  @Override
  public void process() {
    prepair();
    kneadFlour();
    steamed();
  }
}
