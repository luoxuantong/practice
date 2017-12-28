package base;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by 罗选通 on 2017/11/7.
 */
public class Main{

  @Test
  public void main(){
    ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:/spring/spring-service.xml");
    System.out.println("已成功发布RMI服务类");
  }
}
