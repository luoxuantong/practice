package me.anmt.ssm.dynamic_proxy;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class Test {
  public static void main(String[] args){
//    LogHandler logHandler = new LogHandler();
//    IBaseBusiness baseBusiness = (IBaseBusiness) logHandler.newProxyInstance(new BaseBusinessImpl());
//    baseBusiness.start("31213");



    BookFacadeCglib bc=new BookFacadeCglib();
    BookFacadeImpl intance = (BookFacadeImpl)bc.getIntance(new BookFacadeImpl());
    intance.init("welcome");
  }
}
