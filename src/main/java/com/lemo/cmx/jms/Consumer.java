package com.lemo.cmx.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/** 消费者
 * Created by 罗选通 on 2017/9/15.
 */
public class Consumer implements MessageListener{

  private Destination destination;

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  @Override
  public void onMessage(Message message) {
    TextMessage textMessage = (TextMessage) message;
    try {
      System.out.println(textMessage.getText()+"Consumer");
    } catch (JMSException e) {
      e.printStackTrace();
    }
  }
}
