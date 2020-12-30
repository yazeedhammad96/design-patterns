package iterator.iterators;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

  private String[] menuItems;
  private int current = -1;

  public DinerMenuIterator(String[] menuItems) {
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    return current < menuItems.length-1;
  }

  @Override
  public Object next() {
    return menuItems[++current];
  }
}
