package strategy.client.impl;

import strategy.behavior.impl.FlyWithWings;
import strategy.behavior.impl.Quack;
import strategy.client.Duck;

public class MallardDuck extends Duck {
  public MallardDuck() {
    super(new FlyWithWings(), new Quack());
  }

  @Override
  public void display() {
    System.out.println("I'm a Mallard duck");
  }
}
