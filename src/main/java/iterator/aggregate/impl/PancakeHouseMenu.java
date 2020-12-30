package iterator.aggregate.impl;

import iterator.aggregate.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
  private List<String> menuItems = new ArrayList<>(3);

  public PancakeHouseMenu() {
    menuItems.add("Cake");
    menuItems.add("Waffle");
    menuItems.add("Chocolate Bar");
  }

  @Override
  public Iterator createIterator() {
    return menuItems.iterator();
  }
}
