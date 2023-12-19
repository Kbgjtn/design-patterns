package facade.demo2;

public class TerminalApp {
  public static void main(String[] args) {
    TerminalFacade terminalFacade = new TerminalFacade();

    int choice = 0;

    do {
      terminalFacade.displayMenu();
      System.out.println("select an option: ");
      choice = Integer.parseInt(System.console().readLine());
      terminalFacade.executeMenuItem(choice);

    } while (choice != 0);
  }
}
