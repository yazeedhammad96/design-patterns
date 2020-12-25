package strategy.behavior.impl;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public class Quack extends QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Quacking quack quack....");
  }
}
