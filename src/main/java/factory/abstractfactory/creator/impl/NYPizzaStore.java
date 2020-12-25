package factory.abstractfactory.creator.impl;

import factory.abstractfactory.creator.PizzaIngredientFactory;
import factory.abstractfactory.creator.PizzaStore;
import factory.abstractfactory.product.Pizza;
import factory.abstractfactory.product.impl.CheesePizza;
import factory.abstractfactory.product.impl.ClamPizza;

public class NYPizzaStore extends PizzaStore {
  @Override
  protected Pizza createPizza(String item) {
    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    if ("cheese".equals(item)) {
      pizza = new CheesePizza(pizzaIngredientFactory);
      pizza.setName("New York Style Cheese Pizza");

    } else if ("Clam".equals(item)) {
      pizza = new ClamPizza(pizzaIngredientFactory);
      pizza.setName("New York Style Clam Pizza");

    }
    return pizza;
  }

}
