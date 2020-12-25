package strategy.client;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public abstract class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }
  public void performQuack(){
    quackBehavior.quack();
  }
  public void swim(){
    System.out.println("Swim quack Swim....");
  }
  public abstract void display();

  public void performFly(){
    flyBehavior.fly();
  }
}
