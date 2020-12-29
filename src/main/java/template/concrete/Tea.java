package template.concrete;

import template.templates.CaffieneBeverage;

public class Tea extends CaffieneBeverage {
  @Override
  protected void brew() {
    System.out.println("Steeping the tea bag");
  }

  @Override
  protected void addCondiments() {
    System.out.println("Add Lemon");
  }
}
