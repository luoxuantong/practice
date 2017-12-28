package com.lemo.cmx.rpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class Consumer {
  public static void main(String[] args) throws NoSuchMethodException, IOException, ClassNotFoundException {
    //接口名称
    String interfacename = SayHelloService.class.getName();
    //需要远程执行的方法
    Method method = SayHelloService.class.getMethod("sayHello", String.class);
    //需要传递到远端的参数
    Object[] arguments = {"hell9"};

    Socket socket = new Socket("127.0.0.1", 1234);
    //将方法名称和参数传递到远端
    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
    outputStream.writeUTF(interfacename);
    outputStream.writeUTF(method.getName());
    outputStream.writeObject(method.getParameterTypes());
    outputStream.writeObject(arguments);

    //从远端读取方法执行结果
    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
    Object o = inputStream.readObject();
    System.out.println(o);


  }
}
