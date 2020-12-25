package factory.abstractfactory;

import factory.abstractfactory.creator.PizzaStore;
import factory.abstractfactory.creator.impl.NYPizzaStore;

public class AbstractFactoryDemo {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    nyPizzaStore.orderPizza("cheese");
  }
}
