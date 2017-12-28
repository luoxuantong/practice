package com.lemo.cmx.asyncallback;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public interface CallBack {
  /**
   * 执行回调方法
   * @param objects   将处理后的结果作为参数返回给回调方法
   */
  void execute(Object... objects);
}
