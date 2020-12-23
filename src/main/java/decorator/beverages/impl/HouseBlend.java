package decorator.beverages.impl;

import decorator.beverages.Beverage;

public class HouseBlend extends Beverage {

  @Override
  public String getDescription() {
    return "House Blend";
  }

  @Override
  public double cost() {
    return 0.98;
  }
}
