package factory.factorymethod.creator.impl;

import factory.factorymethod.creator.PizzaStore;
import factory.factorymethod.product.Pizza;
import factory.factorymethod.product.impl.NYStyleCheesePizza;
import factory.factorymethod.product.impl.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(String item) {
    if ("cheese".equals(item)) {
      return new NYStyleCheesePizza();
    } else if ("veggie".equals(item)) {
      return new NYStyleVeggiePizza();
    } else {
      return null;
    }
  }

}
