package demo1.proxy;

public class Client {
  public static void main(String[] args) {
    Internet internet = new ProxyInternet();

    try {
      /* Return connect to host server  */
      internet.connecTo("geksong.com");

      /* Return throw Exception  */
      internet.connecTo("abc.com");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
