package demo1.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
  private final Internet internet = new RealInternet();
  private static final List<String> bannedSites;

  static {
    bannedSites = new ArrayList<String>();
    bannedSites.add("abc.com");
    bannedSites.add("def.com");
    bannedSites.add("hij.com");
  }

  @Override
  public void connecTo(String serverhost) throws Exception {
    if (bannedSites.contains(serverhost.toLowerCase())) {
      throw new Exception("Access Denied!");
    }

    internet.connecTo(serverhost);
  }
}
