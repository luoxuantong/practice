import com.alibaba.com.caucho.hessian.io.HessianInput;
import com.alibaba.com.caucho.hessian.io.HessianOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import object.User;

/**
 * Created by 罗选通 on 2017/11/6.
 */
public class Test {

  @org.junit.Test
  public void test() {
    String s = "1-1,2-12,3-123,4-1234,5-12345";
    String param1 = "2";
    String param2 = "0";
    String[] split = s.split(",");
    System.out.println(Arrays.toString(split));
    boolean flag = false;
    for (int i = 0; i < split.length; i++) {
      String[] split1 = split[i].split("-");
      String[] split2 = split1[1].split("");
      if (split1[0].equals(param1)) {
        for (int j = 0; j < split2.length; j++) {
          if (split2[j].equals(param2)) {
            flag = true;
            break;
          }
        }
      }
    }
    System.out.println(flag);
  }

  @org.junit.Test
  public void arrays() {
    String[] s = new String[10];
    Arrays.fill(s, 0, 9, "1");
    Arrays.sort(s);
    System.out.println(Arrays.toString(s));
  }

  /**
   * @Description java内置序列化，反序列化
   * @Author 罗选通
   * @Date 2017/11/7 20:14
   * @method
   */
  @org.junit.Test
  public void serialize() throws IOException, ClassNotFoundException {
    //定义字节数组输出流
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    //对象输出流
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    User user = getUser();
    //将对象写入到字节数组输出，进行序列化
    objectOutputStream.writeObject(user);
    byte[] bytes = outputStream.toByteArray();

    //字节数组输入流
    ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(bytes);

    ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
    //执行反序列化，从流中读取数据
    Object o = objectInputStream.readObject();
    System.out.println(o.toString());

  }


  public User getUser() {
    User user = new User();
    user.setFullname("Luo xuantong");
    user.setSalt("霄哥是个大傻");
    return user;
  }

  @org.junit.Test
  public void hessian() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    HessianOutput hessianOutput = new HessianOutput(byteArrayOutputStream);
    hessianOutput.writeObject(getUser());

    byte[] bytes = byteArrayOutputStream.toByteArray();

    //hessian的反序列化读取对象
    ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
    HessianInput input = new HessianInput((inputStream));
    Object o = input.readObject();
    System.out.println(o.toString());
  }

  @org.junit.Test
  public void finallyTest() {
    System.out.println("getValue()返回值为:" + getValue());
  }

//  public static int getValue() {
//    try {
//      return 0;
//    } finally {
//      return 1;
//    }
//  }
  public static int getValue() {
    int i = 1;
    try {
      return i;
    } finally {
      i++;
    }
  }

}
