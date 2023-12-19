package mediator.demo1;

public interface User {
  void sendMessage(String message, User receiver);

  void receiveMessage(User sender, String message);
}
