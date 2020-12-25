package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public class FlyWithWings extends FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm Flying.....");
  }
}
