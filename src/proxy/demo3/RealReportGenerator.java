package proxy.demo3;

public class RealReportGenerator implements ReportGenerator {
  @Override
  public void generate() {
    System.out.println("Generating report...");
  }
}
