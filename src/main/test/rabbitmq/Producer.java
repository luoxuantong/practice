package rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Created by 罗选通 on 2017/11/27.
 */
public class Producer {

  public final static String QUEUE_NAME = "rabbitMQ.test1";

  public static void main(String[] args) throws IOException, TimeoutException {
    //创建连接工厂
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");
    factory.setUsername("admin");
    factory.setPassword("123456");
    //创建一个新的连接
    Connection connection = factory.newConnection();
    //创建一个通道
    Channel channel = connection.createChannel();
    //  声明一个队列
    channel.queueDeclare(QUEUE_NAME, false, false, true, null);
    //发送消息到队列中
    String message = "Hello RabbitMQ";
    channel.basicPublish("", QUEUE_NAME, null, message.getBytes("utf-8"));
    System.out.println("Producer Send +'" + message + "'");
    String queue = channel.queueDeclare().getQueue();
    System.out.println(queue);
    //关闭通道和连接
    channel.close();
    connection.close();
  }
}
