package me.anmt.ssm.callback;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class Tools {

  public void run(CallBack callBack){
    long l = System.currentTimeMillis();
    int execute = callBack.execute(1);
    System.out.println(1);
    long l1 = System.currentTimeMillis();
    System.out.println(l1-l);
  }
  public static void main(String[] a){
    Tools tools = new Tools();
    tools.run(new CallBack() {
      @Override
      public int execute(int c) {
        return c;
      }
    });
  }
}
