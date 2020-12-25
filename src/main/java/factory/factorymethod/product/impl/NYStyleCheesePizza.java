package factory.factorymethod.product.impl;

import factory.factorymethod.product.Pizza;

public class NYStyleCheesePizza extends Pizza {

  public NYStyleCheesePizza() {
    name = "NY style Sauce and Cheese Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marina Sauce";
    toppings.add("Grated Reggiano Cheese");
  }
}
