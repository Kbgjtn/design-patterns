package proxy.demo3;

public class Client {
  public static void main(String[] args) {
    String userRole = "Manager";
    System.out.println("current user role: " + userRole);
    ReportGenerator reportGeneratorAdmin = new ProxyReportGenerator(userRole);
    reportGeneratorAdmin.generate();

    userRole = "Customer";
    System.out.println("\ncurrent user role: " + userRole);
    ReportGenerator reportGeneratorCustomer = new ProxyReportGenerator(userRole);
    reportGeneratorCustomer.generate();
  }
}
