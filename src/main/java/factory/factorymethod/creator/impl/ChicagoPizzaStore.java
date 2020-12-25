package factory.factorymethod.creator.impl;

import factory.factorymethod.creator.PizzaStore;
import factory.factorymethod.product.Pizza;
import factory.factorymethod.product.impl.ChicagoStyleCheesePizza;
import factory.factorymethod.product.impl.ChicagoStylePepperoniPizza;
import factory.factorymethod.product.impl.NYStyleCheesePizza;
import factory.factorymethod.product.impl.NYStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(String item) {
    if ("cheese".equals(item)) {
      return new ChicagoStyleCheesePizza();
    } else if ("pepperoni".equals(item)) {
      return new ChicagoStylePepperoniPizza();
    } else {
      return null;
    }
  }

}
