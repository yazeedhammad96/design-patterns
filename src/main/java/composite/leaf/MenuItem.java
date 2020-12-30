package composite.leaf;

import composite.component.MenuComponent;

public class MenuItem extends MenuComponent {
  String name;
  String description;
  double price;
  boolean vegetarian;

  public MenuItem(String name, String description, double price, boolean vegetarian) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vegetarian = vegetarian;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public boolean isVegetarian() {
    return vegetarian;
  }

  @Override
  public void print() {
    System.out.println(getName());
    if (isVegetarian()) {
      System.out.print("(V)");
    }
    System.out.print("  " + getPrice());
    System.out.println("  " + getDescription());
    System.out.println("-----");
  }

  @Override
  public String toString() {
    return "MenuItem{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        ", vegetarian=" + vegetarian +
        '}';
  }
}
