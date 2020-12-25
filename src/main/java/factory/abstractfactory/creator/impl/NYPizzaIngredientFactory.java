package factory.abstractfactory.creator.impl;

import factory.abstractfactory.creator.PizzaIngredientFactory;
import factory.abstractfactory.model.Dough;
import factory.abstractfactory.model.*;
import factory.abstractfactory.model.veggies.Garlic;
import factory.abstractfactory.model.veggies.Mushroom;
import factory.abstractfactory.model.veggies.Onion;
import factory.abstractfactory.model.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clam createClam() {
    return new FreshClams();
  }
}
