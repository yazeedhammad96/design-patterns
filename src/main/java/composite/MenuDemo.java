package composite;

import composite.component.MenuComponent;
import composite.composites.Menu;
import composite.leaf.MenuItem;

import java.util.Iterator;

public class MenuDemo {
  public static void main(String[] args) {
    MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Diner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");

    MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

    allMenus.add(pancakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    dinerMenu.add(new MenuItem("Pasta", "Spaghetti", 3.5, true));
    dinerMenu.add(dessertMenu);
    dessertMenu.add(new MenuItem("Apple Pie", "It's Delicious", 2, false));
    cafeMenu.add(new MenuItem("Turkish Coffe", "Boiled coffe", .5, true));
    pancakeHouseMenu.add(new MenuItem("Waffle", "Chocolate Waffle", 3.5, true));

    allMenus.print();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    printRec(allMenus.createIterator());

  }

  public static void printRec(Iterator<MenuComponent> allMenus) {
    while (allMenus.hasNext()) {
      MenuComponent next = allMenus.next();
      System.out.println(next.getName());
      try {
        printRec(next.createIterator());
        System.out.println("----------");
      } catch (UnsupportedOperationException e) {
        // To keep the transparency of dealing with the data, rather than using instanceof
      }
    }
  }
}
