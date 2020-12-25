package factory.factorymethod.product.impl;

import factory.factorymethod.product.Pizza;

public class NYStyleVeggiePizza extends Pizza {

  public NYStyleVeggiePizza() {
    name = "NY style Sauce and Veggie Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marina Sauce";
    toppings.add("Grated Reggiano Veggie");
  }
}
