package strategy;

import strategy.client.Duck;
import strategy.client.impl.MallardDuck;
import strategy.client.impl.ModelDuck;

public class StrategyDemo {
  public static void main(String[] args) {
    Duck mallardDuck=new MallardDuck();
    mallardDuck.display();
    mallardDuck.performFly();
    mallardDuck.performQuack();
    mallardDuck.swim();
    System.out.println("-------------------------");
    Duck modelDuck=new ModelDuck();
    modelDuck.display();
    modelDuck.performFly();
    modelDuck.performQuack();
    modelDuck.swim();

  }
}
