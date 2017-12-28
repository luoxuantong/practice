package me.anmt.ssm.http;

import com.sun.xml.internal.fastinfoset.Encoder;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by 罗选通 on 2017/11/8.
 */
public class Client {

  public static void main(String[] args) throws IOException {
    Request request = new Request();
    request.setCommend("HELLO");
    request.setCommandLength(request.getCommend().length());
    request.setEncode(Encoder.UTF_8.getBytes());

    Socket client = new Socket("127.0.0.1", 4567);
    OutputStream output = client.getOutputStream();
    ProtocolUtil.writeRequest(output,request);
  }
}
