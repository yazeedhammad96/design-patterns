package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;

public class FlyNoWay extends FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't Fly");
  }
}
