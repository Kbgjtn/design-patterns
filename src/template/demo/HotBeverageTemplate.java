package template.demo;

public abstract class HotBeverageTemplate {
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  protected abstract void brew();

  protected abstract void addCondiments();

  // Common methods with default behavior
  protected void boilWater() {
    System.out.println("Boiling water");
  }

  protected void pourInCup() {
    System.out.println("Pouring into cup");
  }
}
