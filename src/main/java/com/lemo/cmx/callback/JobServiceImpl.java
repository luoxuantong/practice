package com.lemo.cmx.callback;

/**小明
 * Created by 罗选通 on 2017/9/12.
 */
public class JobServiceImpl {


  public void jisuan(int a, int b) {
    new SuperService().add(a, b, new IJobService() {
      @Override
      public void run(int a, int b, Integer result) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);
      }
    });
  }
}
