package mediator.demo1;

// Mediator (Chat Mediator)
public interface ChatMediator {
  void addUser(User user);

  void removeUser(User user);

  void sendMessage(User sender, String message, User receiver);
}
