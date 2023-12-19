package template.demo;

public class Tea extends HotBeverageTemplate {
  @Override
  public void brew() {
    System.out.println("Steeping tea bag");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding lemon");
  }
}
