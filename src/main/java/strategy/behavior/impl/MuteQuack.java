package strategy.behavior.impl;

import strategy.behavior.QuackBehavior;

public class MuteQuack extends QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<<Silence>>");
  }
}
