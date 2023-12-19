package template.demo;

public class Coffee extends HotBeverageTemplate {
  @Override
  public void brew() {
    System.out.println("Brewing coffee grinds");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding sugar and milk");
  }
}
