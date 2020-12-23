package decorator.beverages.impl;

import decorator.beverages.Beverage;

public class Espresso extends Beverage {

  @Override
  public String getDescription() {
    return "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
