package template.concrete;

import template.templates.CaffieneBeverage;

public class Coffe extends CaffieneBeverage {
  @Override
  protected void brew() {
    System.out.println("Brew the coffe grinds");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Add sugar and milk");

  }
}
