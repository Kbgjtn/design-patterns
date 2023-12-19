package facade.demo2;

public class TerminalFacade {
  private UserAuth userAuth;
  private FileOperations fileOperations;
  private ProcessManagement processManagement;

  public TerminalFacade() {
    userAuth = new UserAuth();
    fileOperations = new FileOperations();
    processManagement = new ProcessManagement();
  }

  public void displayMenu() {
    System.out.println("==== Terminal Menu ====");
    System.out.println("1. Authenticate user");
    System.out.println("2. Create file");
    System.out.println("3. Delete file");
    System.out.println("4. Start process");
    System.out.println("5. Stop process");
    System.out.println("0. Exit");
  }

  public void executeMenuItem(int choice) {
    switch (choice) {
      case 1:
        authenticateUser();
        break;
      case 2:
        createFile();
        break;
      case 3:
        deleteFile();
        break;
      case 4:
        startProcess();
        break;
      case 5:
        stopProcess();
        break;
      case 0:
        System.out.println("Bye!");
        break;
      default:
        System.out.println("Invalid choice!");
        break;
    }
  }

  private void authenticateUser() {
    System.out.println("Enter username: ");
    String username = System.console().readLine();
    System.out.println("Enter password: ");
    String password = System.console().readLine();
    userAuth.authenticate(username, password);
  }

  private void createFile() {
    System.out.println("Enter file name: ");
    String fileName = System.console().readLine();
    fileOperations.createFile(fileName);
  }

  private void deleteFile() {
    System.out.println("Enter file name: ");
    String fileName = System.console().readLine();
    fileOperations.deleteFile(fileName);
  }

  private void startProcess() {
    System.out.println("Enter process name: ");
    String processName = System.console().readLine();
    processManagement.start(processName);
  }

  private void stopProcess() {
    System.out.println("Enter process name: ");
    String processName = System.console().readLine();
    processManagement.stop(processName);
  }
}
