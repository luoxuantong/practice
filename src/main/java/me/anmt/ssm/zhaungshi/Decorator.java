package me.anmt.ssm.zhaungshi;

/**
 * Created by 罗选通 on 2017/9/26.
 */
public abstract class Decorator implements Person{

  private Person person;

  public void setPerson(Person person) {
    this.person = person;
  }

  public void eat() {
    person.eat();
  }

}
