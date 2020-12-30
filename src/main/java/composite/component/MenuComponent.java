package composite.component;

import java.util.Iterator;

public abstract class MenuComponent {

  /**
   * Those are the composite methods
   */
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  public MenuComponent get(int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * Those are the operations methods
   */
  public String getName() {
    throw new UnsupportedOperationException();
  }

  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  public void print() {
    throw new UnsupportedOperationException();
  }

  public Iterator<MenuComponent> createIterator() {
    throw new UnsupportedOperationException();
  }
}
