package demo1.proxy;

public class RealInternet implements Internet {
  @Override
  public void connecTo(String serverhost) throws Exception {
    System.out.println("Connecting to " + serverhost);
  }
}
