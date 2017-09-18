package me.anmt.ssm.callback;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class SuperService {

  public void add(int a,int b,IJobService jobService){
    jobService.run(a,b,a+b);
  }
}
