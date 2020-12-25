package factory.abstractfactory.product.impl;

import factory.abstractfactory.creator.PizzaIngredientFactory;
import factory.abstractfactory.product.Pizza;

public class ClamPizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public ClamPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clam = ingredientFactory.createClam();
  }
}
