package iterator;

import iterator.aggregate.Menu;
import iterator.aggregate.impl.DinerMenu;
import iterator.aggregate.impl.PancakeHouseMenu;
import iterator.client.Waitress;

public class IteratorDemo {
  public static void main(String[] args) {
    Menu dinerMenu = new DinerMenu();
    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
    waitress.printMenu();
  }
}
