package composite.client;

import composite.component.MenuComponent;

public class Waitress {
  MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void print() {
    allMenus.print();
  }
}
