package me.anmt.ssm.exception;

import me.anmt.ssm.response.Response;
import me.anmt.ssm.response.ReturnMsg;

/**
 * Created by 罗选通 on 2017/9/25.
 */
public class MyException extends RuntimeException {

  private static final long serialVersionUID = 2982116313617540749L;

  private ReturnMsg result;


  public MyException() {
    result = new ReturnMsg(Response.FAIL);
  }


  public MyException(String message) {
    result = new ReturnMsg();
    result.setCode(ReturnMsg.MSG_CODE);
    result.setMsg(message);
  }

  public MyException(String message, Object data) {
    result = new ReturnMsg();
    result.setCode(ReturnMsg.MSG_CODE);
    result.setMsg(message);
    result.setData(data);
  }

  public MyException(Response response) {
    result = new ReturnMsg(response);
  }

  public MyException(ReturnMsg returnMsg) {
    result = returnMsg;
  }

  public ReturnMsg getResult() {
    return result;
  }

}

