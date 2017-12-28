package me.anmt.ssm.rpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class Provider {

  public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    //用于存放生产者服务接口的Map,实际的框架中会有专门保存服务提供者的
    Map<String, Object> services = new HashMap();
    services.put(SayHelloService.class.getName(), new SayHelloServiceImpl());

    ServerSocket server = new ServerSocket(1234);
    while (true) {
      Socket socket = server.accept();
      //读取服务信息
      ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
      String interfacename = objectInputStream.readUTF();
      String methodName = objectInputStream.readUTF();
      Class<?>[] parameterTypes = (Class<?>[]) objectInputStream.readObject();
      Object[] arguments = (Object[]) objectInputStream.readObject();

      //执行调用
      Class aClass = Class.forName(interfacename);//得到接口的class

      Object o = services.get(interfacename);//取得服务实现的对象
      //获取需要执行的方法
      Method method = aClass.getMethod(methodName, parameterTypes);
      //通过反射进行调用
      Object invoke = method.invoke(o, arguments);
      //返回给客户端即服务消费者数据
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
      objectOutputStream.writeObject(invoke);
    }
  }
}
