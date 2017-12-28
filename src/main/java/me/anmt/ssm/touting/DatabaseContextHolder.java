package me.anmt.ssm.touting;

/**
 * Created by 罗选通 on 2017/9/6.
 */
public class DatabaseContextHolder {

  private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

  public static void setCustomerType(String customerType) {
    contextHolder.set(customerType);
  }

  public static String getCustomerType() {
    return contextHolder.get();
  }

  public static void clearCustomerType() {
    contextHolder.remove();
  }
}
