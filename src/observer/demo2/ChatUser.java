package observer.demo2;

public class ChatUser implements User {
  private String name;

  public ChatUser(String name) {
    this.name = name;
  }

  @Override
  public void update(String message) {
    System.out.println(name + " received message: " + message);
  }
}
