package me.anmt.ssm.callback;

/**
 * Created by 罗选通 on 2017/9/12.
 */
public class Test {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    JobServiceImpl jobService = new JobServiceImpl();
    JobServiceImplZ jobServicez = new JobServiceImplZ();
    jobService.jisuan(a, b);
    jobServicez.jisuan(c, d);

  }
}
