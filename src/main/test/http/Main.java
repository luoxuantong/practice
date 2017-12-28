package http;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

import object.User;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class Main {

  @Test
  public void test() throws IOException {
    String url="http://www.baidu.com/";
    //组装请求
    HttpClient httpClient = new DefaultHttpClient();
    HttpGet httpGet = new HttpGet(url);

    //接受响应
    HttpResponse response = httpClient.execute(httpGet);
    HttpEntity entity = response.getEntity();
    byte[] bytes = EntityUtils.toByteArray(entity);
    String s = new String(bytes, "utf-8");
    System.out.println(s);
  }
  public User getUser(){
    User user = new User();
    user.setFullname("Luo xuantong");
    user.setSalt("霄哥是个大傻");
    return user;
  }
  /**
   * @Description 将java对象转换为xml
   * @Author 罗选通
   * @Date 2017/11/8 16:08
   * @method
   */
  @Test
  public void test1(){
    User user=getUser();
    XStream xStream = new XStream(new DomDriver());
    xStream.alias("user",User.class);
    String s = xStream.toXML(user);
    System.out.println(s);
    User o = (User) xStream.fromXML(s);
    System.out.println(o);
  }
}
