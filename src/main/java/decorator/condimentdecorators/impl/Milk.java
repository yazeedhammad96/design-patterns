package decorator.condimentdecorators.impl;

import decorator.beverages.Beverage;
import decorator.condimentdecorators.CondimentDecorator;

public class Milk extends CondimentDecorator {

  private Beverage decoratedBeverage;

  public Milk(Beverage decoratedBeverage) {
    this.decoratedBeverage = decoratedBeverage;
  }

  @Override
  public String getDescription() {
    return decoratedBeverage.getDescription()+", Milk";
  }

  @Override
  public double cost() {
    return decoratedBeverage.cost() + 0.7;
  }
}
