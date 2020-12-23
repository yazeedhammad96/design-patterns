package decorator.condimentdecorators.impl;

import decorator.beverages.Beverage;
import decorator.condimentdecorators.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  private Beverage decoratedBeverage;

  public Mocha(Beverage decoratedBeverage) {
    this.decoratedBeverage = decoratedBeverage;
  }

  @Override
  public String getDescription() {
    return decoratedBeverage.getDescription()+", Mocha";
  }

  @Override
  public double cost() {
    return decoratedBeverage.cost() + 0.5;
  }
}
