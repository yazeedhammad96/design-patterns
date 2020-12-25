package factory.factorymethod;

import factory.factorymethod.creator.PizzaStore;
import factory.factorymethod.creator.impl.ChicagoPizzaStore;
import factory.factorymethod.creator.impl.NYPizzaStore;
import factory.factorymethod.product.Pizza;

public class FactoryMethodDemo {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
    System.out.println("--------------------------------------------------------");
    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    Pizza chicagoPizza = chicagoPizzaStore.orderPizza("pepperoni");
  }
}
