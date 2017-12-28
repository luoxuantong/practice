package com.lemo.cmx.asyncallback;


/**
 * Created by 罗选通 on 2017/9/13.
 */
public class Local implements CallBack,Runnable {

  private Remote remote;

  /**
   * 发送出去的消息
   */
  private String message;
  public Local(Remote remote, String message) {
    super();
    this.remote = remote;
    this.message = message;
  }
  /**
   * 发送消息
   */
  public void sendMessage()
  {
    /**当前线程的名称**/
    System.out.println(Thread.currentThread().getName());
    /**创建一个新的线程发送消息**/
    Thread thread = new Thread(this);
    thread.start();
    System.out.println(thread.getName());
    /**当前线程继续执行**/
    System.out.println("Message has been sent by Local~!");
  }
  @Override
  public void run() {
    remote.executeMessage(message, this);  //这相当于给同学打电话，打完电话之后，这个线程就可以去做其他事情了，只不过等到你的同学打回电话给你的时候你要做出响应
  }

  @Override
  public void execute(Object... objects) {
    /**打印返回的消息**/
    System.out.println(objects[0]);
    /**打印发送消息的线程名称**/
    System.out.println(Thread.currentThread().getName());
    /**中断发送消息的线程**/
    Thread.interrupted();
  }

  public static  void main(String[] args){
    Local local = new Local(new Remote(),"Hello");
    local.sendMessage();
  }
}
