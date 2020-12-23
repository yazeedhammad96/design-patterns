package decorator;

import decorator.beverages.Beverage;
import decorator.beverages.impl.Espresso;
import decorator.beverages.impl.TurkishCoffe;
import decorator.condimentdecorators.CondimentDecorator;
import decorator.condimentdecorators.impl.Milk;
import decorator.condimentdecorators.impl.Mocha;

public class DecoratorDemo {
  public static void main(String[] args) {
    Beverage espressoBeverage = new Espresso();
    espressoBeverage = new Milk(espressoBeverage);
    espressoBeverage = new Mocha(espressoBeverage);
    //With double shot mocha xd
    espressoBeverage = new Mocha(espressoBeverage);
    System.out.println(espressoBeverage.cost() + " " + espressoBeverage.getDescription());

    Beverage turkishCoffeBeverage = new TurkishCoffe();
    System.out.println(turkishCoffeBeverage.cost() + " " + turkishCoffeBeverage.getDescription());
  }
}
