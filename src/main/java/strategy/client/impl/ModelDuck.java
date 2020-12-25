package strategy.client.impl;

import strategy.behavior.impl.FlyNoWay;
import strategy.behavior.impl.FlyWithWings;
import strategy.behavior.impl.MuteQuack;
import strategy.behavior.impl.Quack;
import strategy.client.Duck;

public class ModelDuck extends Duck {
  public ModelDuck() {
    super(new FlyNoWay(), new MuteQuack());
  }

  @Override
  public void display() {
    System.out.println("I'm a Model duck");
  }
}
