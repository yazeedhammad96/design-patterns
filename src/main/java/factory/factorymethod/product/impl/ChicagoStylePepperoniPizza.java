package factory.factorymethod.product.impl;

import factory.factorymethod.product.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

  public ChicagoStylePepperoniPizza() {
    name = "Chicago style Sauce and Pepperoni Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";
    toppings.add("Shredded Mozzarella Pepperoni");
  }

  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
