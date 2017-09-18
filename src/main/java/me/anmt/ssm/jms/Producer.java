package me.anmt.ssm.jms;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;

/**
 * Created by 罗选通 on 2017/9/15.
 */
public class Producer {

  private Destination queuedestination;

  private Destination topicdestination;
  private JmsTemplate jmsTemplate;

  public void setTopicdestination(Destination topicdestination) {
    this.topicdestination = topicdestination;
  }

  public void setDestination(Destination destination) {
    this.queuedestination = destination;
  }

  public void setJmsTemplate(JmsTemplate jmsTemplate) {
    this.jmsTemplate = jmsTemplate;
  }

  public void queue(){
    jmsTemplate.convertAndSend(queuedestination,"123131231queue");
  }

  public void topic(){
    jmsTemplate.convertAndSend(topicdestination,"123131231topic");
  }
}
