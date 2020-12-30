package iterator.client;

import iterator.aggregate.Menu;

import java.util.Iterator;

public class Waitress {
  private Menu dinerMenu;
  private Menu pancakeHouseMenu;

  public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
    this.dinerMenu = dinerMenu;
    this.pancakeHouseMenu = pancakeHouseMenu;
  }

  public void printMenu() {
    System.out.println("--------Pancake House Menu--------");
    printMenu(pancakeHouseMenu.createIterator());
    System.out.println("--------Diner Menu--------");
    printMenu(dinerMenu.createIterator());
  }

  private void printMenu(Iterator iterator) {
    iterator.forEachRemaining(x -> System.out.println(x));
  }
}
