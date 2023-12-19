package facade.demo2;

public class ProcessManagement {
  public void start(String processName) {
    System.out.println("ProcessManagement: start" + processName);
  }

  public void stop(String processName) {
    System.out.println("ProcessManagement: stop " + processName);
  }
}
