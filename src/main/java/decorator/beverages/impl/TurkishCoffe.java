package decorator.beverages.impl;

import decorator.beverages.Beverage;

public class TurkishCoffe extends Beverage {

  @Override
  public String getDescription() {
    return "Turkish Coffe";
  }

  @Override
  public double cost() {
    return 0.5;
  }
}
