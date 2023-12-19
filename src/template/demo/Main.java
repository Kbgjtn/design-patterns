package template.demo;

public class Main {
  public static void main(String[] args) {
    System.out.println("Creating tea hot beverage");
    System.out.println("--------------------");
    HotBeverageTemplate tea = new Tea();
    tea.prepareRecipe();

    System.out.println("Creating coffee hot beverage");
    System.out.println("--------------------");
    HotBeverageTemplate coffee = new Coffee();
    coffee.prepareRecipe();
  }
}
