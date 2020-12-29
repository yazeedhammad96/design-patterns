package template.templates;

public abstract class CaffieneBeverage {

  protected void boilWater() {
    System.out.println("Boiling Water...");
  }

  protected void pourInCup() {
    System.out.println("Pouring in a Cup...");
  }

  public final void prepareRecipe() {
    System.out.println("Preparing Recipe...");
    boilWater();
    brew();
    pourInCup();
    addCondiments();
    System.out.println("End Preparing Recipe...");
  }

  protected abstract void brew();

  protected abstract void addCondiments();
}
