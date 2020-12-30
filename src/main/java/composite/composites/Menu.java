package composite.composites;

import composite.component.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
  List<MenuComponent> menuComponents;
  String name;
  String description;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
    menuComponents = new ArrayList<>();
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponent.remove(menuComponent);
  }

  @Override
  public MenuComponent get(int i) {
    return menuComponents.get(i);
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
  public void print() {
    System.out.println("Name: " + getName());
    System.out.println("Description: " + getDescription());
    System.out.println("---------------------------");
    menuComponents.stream().forEach(menuComponent -> menuComponent.print());
  }

  @Override
  public Iterator<MenuComponent> createIterator() {
    return menuComponents.iterator();
  }

//  private Iterator<MenuComponent> createIterator(MenuComponent menuComponent) {
//    menuComponents.stream().flatMap(m -> menuComponent.;
//  }

  @Override
  public String toString() {
    return "Menu{" +
        "menuComponents=" + menuComponents +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
