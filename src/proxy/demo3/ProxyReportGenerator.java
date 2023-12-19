package proxy.demo3;

public class ProxyReportGenerator implements ReportGenerator {
  private RealReportGenerator reportGenerator;
  private String userRole;

  public ProxyReportGenerator(String role) {
    this.userRole = role;
  }

  @Override
  public void generate() {
    if (userHasAccess()) {
      if (reportGenerator == null) {
        reportGenerator = new RealReportGenerator();
      }

      reportGenerator.generate();
    } else {
      System.out.println("You don't have access to generate reports.");
    }
  }

  private boolean userHasAccess() {
    return userRole.equals("Manager") || userRole.equals("Admin") ? true : false;
  }
}
