package template.client;

import template.concrete.Coffe;
import template.concrete.Tea;
import template.templates.CaffieneBeverage;

public class TemplateDemo {
  public static void main(String[] args) {
    CaffieneBeverage coffe = new Coffe();
    CaffieneBeverage tea = new Tea();
    coffe.prepareRecipe();
    tea.prepareRecipe();
  }
}
