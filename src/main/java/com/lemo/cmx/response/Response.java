package com.lemo.cmx.response;
public enum Response {
  LOGIN_SUCCESS(12000,"登录成功"),
  REGISTER_SUCCESS(12000,"是否需要绑定第三方登录"),
  REGISTER_SUCCESS_WRITE_INFO(12000,"手机号注册成功,请完善师父信息"),
  LOGIN_SUCCESS_WRITE_INFO(12010,"登录成功,请完善师父信息"),
  SUCCESS(12000, "请求成功"), //
  LIKE_SUCCESS(12000, "点赞成功"), //
  FAIL(13000, "请求失败"), //
  NO_LOGIN(12300,"请登录后点赞"),
  MONK_NO_INFO(12000,"请完善师父信息"),
  UN_AUTHORIZATION(54000,"登录已过期,请重新登录"),    //跳到登录界面
  NEED_BIND_WX(31000, "没有绑定微信账号不能提现"), //
  NEED_BIND_ALIPAY(32000, "没有绑定支付宝账号不能提现"), //
  PHONE_NOT_BIND(12001,"请绑定手机号"),
  OPENId_NOT_BINDING(12003,"请绑定openId"),
  BALANCE_NOT_ENOUGH(13000, "账户余额不足"),
  BEING_AUDITED(55000,"师父认证中，请审核通过后再试"),
  USER_SEAL(12500,"账号已封，是否联系渡渡客服"),
  USER_OPERATE_SEAL(12600,"账号异常，请重新登录"),
  NEWEST_VERSION(304,"最新版本号");
  
  private Integer code;
  private String msg;

  Response(Integer code, String message) {
    this.code = code;
    this.msg = message;
  }

  public Integer getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }
}
