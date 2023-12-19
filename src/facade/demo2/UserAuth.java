package facade.demo2;

public class UserAuth {
  public boolean authenticate(String userName, String password) {
    return userName.equals("admin") && password.equals("admin");
  }
}
