package me.anmt.ssm.guanchazhe;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class SubjectImpl implements Subject {

  private List<OBserver> oBservers=Lists.newArrayList();

  @Override
  public void registerObserver(OBserver observer) {
    this.oBservers.add(observer);
  }

  @Override
  public void removeObserver(OBserver observer) {
    this.oBservers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (OBserver observer : oBservers) {
      observer.update();
    }
  }
}
