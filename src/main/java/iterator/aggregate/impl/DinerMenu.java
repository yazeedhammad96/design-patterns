package iterator.aggregate.impl;

import iterator.aggregate.Menu;
import iterator.iterators.DinerMenuIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DinerMenu implements Menu {
  private String[] menuItems = new String[3];

  public DinerMenu() {
    menuItems[0] = "Pizza";
    menuItems[1] = "Burger";
    menuItems[2] = "Rice";
  }

  @Override
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
