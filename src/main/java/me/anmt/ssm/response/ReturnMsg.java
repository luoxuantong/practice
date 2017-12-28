package me.anmt.ssm.response;

public class ReturnMsg {

  private Integer code;
  private String msg;
  private Object data;
  private String version;

  public static final Integer SUCCESS_CODE = 12000;
  public static final String SUCCESS_MSG = "请求成功";

  public static final Integer ERROR_CODE = 10000;
  public static final String ERROR_MSG = "请求失败";

  public static final String MSG = "errormsg";
  public static final Integer MSG_CODE = 13000;
  

  public static final ReturnMsg RED_ENVELOPE_RECEIVED = new ReturnMsg(12000, "红包已领取");
  public static final ReturnMsg SUCCESS = new ReturnMsg(12000, "请求成功");
  public static final ReturnMsg NO_MORE_DATA = new ReturnMsg(14000, "没有更多数据");
  public static final ReturnMsg BLESSING_SUCCESS = new ReturnMsg(12000, "福报成功兑换");
  public static final ReturnMsg SEND_SUCCESS = new ReturnMsg(12000, "短信验证码发送成功");
  public static final ReturnMsg PHONE_NO_REGISTER = new ReturnMsg(14200, "该手机号尚未注册");
  public static final ReturnMsg FAIL = new ReturnMsg(13000, "请求失败");
  public static final ReturnMsg BLESSING = new ReturnMsg(13600, "本次操作不能增加您的福报值");
  public static final ReturnMsg BLESSING_EXCHANGE = new ReturnMsg(13100, "您目前不能兑换，兑换红包最少500福报值");
  public static final ReturnMsg NET_ERROR = new ReturnMsg(13000, "网络异常");
  public static final ReturnMsg TOKENERROR = new ReturnMsg(11000, "token校验失败");
  public static final ReturnMsg PHONE_EXISTS = new ReturnMsg(14100, "该手机号已注册，请用手机号登录");
  public static final ReturnMsg INFO_VERIFICATION_SUCCEES = new ReturnMsg(12001, "已提交正在审核中");
  public static final ReturnMsg VALIDERROR = new ReturnMsg(13000, "参数错误");
  public static final ReturnMsg LOGIN_PWD_MISTAKE = new ReturnMsg(16000, "密码错误，是否找回密码或明天再来！");
  public static final ReturnMsg SEND_CODE_MISTAKE = new ReturnMsg(16000, "短信验证码输错三次，请第二天再来！");
  public static final ReturnMsg SEND_CODE_COUNT = new ReturnMsg(16000, "第二天再来");
  public static final ReturnMsg SEND_ERROR = new ReturnMsg(17000, "短信验证码发送失败");
  public static final ReturnMsg PWD_NOTMATCH = new ReturnMsg(18000, "密码不一致");
  public static final ReturnMsg PWD_WRONG = new ReturnMsg(19000, "账号或密码错误");
  public static final ReturnMsg UPDATE_ERROR = new ReturnMsg(20000, "用户审核未通过请重新填写信息");
  public static final ReturnMsg LIST_NULL = new ReturnMsg(21000, "查询结果为空");
  public static final ReturnMsg VALIDERROR_NUll = new ReturnMsg(22000, "参数错误");
  public static final ReturnMsg ADD_FAIL = new ReturnMsg(23000, "新增失败");
  public static final ReturnMsg REPEAT_SIGN = new ReturnMsg(24000, "重复签到");
  public static final ReturnMsg REPEAT_REQ = new ReturnMsg(25000, "重复请求");
  public static final ReturnMsg PHONE_NO_BIND = new ReturnMsg(26000, "手机号未注册或绑定");
  public static final ReturnMsg LENGTH_MORE = new ReturnMsg(27000, "标签不能超过三个！");
  public static final ReturnMsg SET_PAYPWD = new ReturnMsg(53000, "请设置支付密码");
  public static final ReturnMsg PAYPWD_UPDATE = new ReturnMsg(52000, "找回密码或明天再来");
  public static final ReturnMsg PAYPWD_UPDATE_SUCCESS = new ReturnMsg(12000, "支付密码修改成功");
  public static final ReturnMsg PAYPWD_UPDATE_FALL = new ReturnMsg(57000, "支付密码修改失败");
  public static final ReturnMsg PAYPWD_SET_SUCCESS = new ReturnMsg(12000, "支付密码设置成功");
  public static final ReturnMsg PAYPWD_SET_FALL = new ReturnMsg(58000, "支付密码设置失败");
  public static final ReturnMsg MISTAKE_PAYPWD = new ReturnMsg(55000, "支付密码不正确");
  public static final ReturnMsg RIGHT_PAYPWD = new ReturnMsg(12000, "支付密码正确");
  public static final ReturnMsg CANCEL_FOLLOW = new ReturnMsg(12000, "取关成功");
  public static final ReturnMsg SUCCESS_FOLLOW = new ReturnMsg(12000, "关注成功");
  public static final ReturnMsg PLEASE_RETRIEVE_PASSWORD = new ReturnMsg(30000, "密码错误次数过多！请找回密码！");
  public static final ReturnMsg NO_REGISTER = new ReturnMsg(13200, "请先注册，在登录");
  public static final ReturnMsg LOGINWPD_ERROR_CODE = new ReturnMsg(16100, "密码错误，是否找回密码或明天再来！");
  public static final ReturnMsg USER_NO_APPLY = new ReturnMsg(13500, "此用户还没有申请义工");
  public static final ReturnMsg NO_BINDING_WECHAT = new ReturnMsg(15000, "请先绑定提现微信");
  public static final ReturnMsg NO_REALNAME = new ReturnMsg(15100, "请先实名认证");
  public static final ReturnMsg NO_AUDIT_REALNAME = new ReturnMsg(15200, "实名认证正在审核中");
  
  public static final ReturnMsg IMG_CODE_FAILED = new ReturnMsg(14300, "验证码错误");
  
  public static final ReturnMsg NO_DEFEATED_REALNAME = new ReturnMsg(15400, "实名认证审核失败");
  public static final ReturnMsg NO_USER = new ReturnMsg(15300, "当前用户不存在");
  public static final ReturnMsg MISTAKE_INVITECODE = new ReturnMsg(56000, "邀请码不正确");
  public static final ReturnMsg USER_SEAL = new ReturnMsg(12500, "账号已封，是否联系渡渡客服");
  public static final ReturnMsg PWD_REPEAT = new ReturnMsg(12700, "不能与之前密码相同");
  
  public static final ReturnMsg UPDATE_REMARK_SUCCESS = new ReturnMsg(12610, "简介修改成功");       //义工备注修改成功状态
  
  public static final ReturnMsg MERIT_WITHDRAW_FALL = new ReturnMsg(12320, "功德值每个月提现一次");       //功德值提现次数校验
  
  public static final ReturnMsg BLESSING_WITHDRAW_FALL = new ReturnMsg(12330, "您已经兑换过一次了，请下个月再来");    //福报提现次数校验
  
  public static final ReturnMsg RED_ENVELOPE_UNABLE_RECEIVED = new ReturnMsg(12400, "这是义工的红包");         //不能领取义工的红包
  
  
  public ReturnMsg() {

  }


  public ReturnMsg(Integer code, String msg) {
    super();
    this.code = code;
    this.msg = msg;
  }

  public ReturnMsg(Response response) {
    this.code = response.getCode();
    this.msg = response.getMsg();
  }
  
  public ReturnMsg(String version,Response response) {
    this(response);
    this.version = version;
  }

  public ReturnMsg(Response response, Object data) {
    this(response);
    this.data = data;
  }
  
  public ReturnMsg(Response response, Object data,String version) {
    this(response);
    this.data = data;
    this.version = version;
  }

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }
  
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public static final ReturnMsg CAPTCHAFAIL = new ReturnMsg(14000, "请重新输入");
  public static final ReturnMsg DELETE_FAIL = new ReturnMsg(15002, "删除失败");
  public static final ReturnMsg UPDATE_FAIL = new ReturnMsg(15003, "更新失败");
  public static final ReturnMsg INSERT_FAIL = new ReturnMsg(15001, "插入失败");
  public static final ReturnMsg PHONE_NOEXISTS = new ReturnMsg(18001, "手机未注册");
  public static final ReturnMsg PWD_TYPEWRONG = new ReturnMsg(19000, "密码格式错误");
  public static final ReturnMsg NOT_ALLOW_NULL = new ReturnMsg(20000, "参数错误");
  public static final ReturnMsg DOUBLEDRAW_ERROR = new ReturnMsg(21000, "重复领取");
  public static final ReturnMsg Wrong_Paypwd = new ReturnMsg(23000, "支付密码错误");
  public static final ReturnMsg Transfer_Validate = new ReturnMsg(24000, "金额异常，请联系客服");
  public static final ReturnMsg Amount_Notenough = new ReturnMsg(25000, "余额不足");
  public static final ReturnMsg Null_Value = new ReturnMsg(26000, "返回值为空");

}
