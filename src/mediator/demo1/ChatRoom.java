package mediator.demo1;

import java.util.ArrayList;
import java.util.List;

// ChatRoom is the Concrete mediator of the chat app.
public class ChatRoom implements ChatMediator {
  private List<User> users = new ArrayList<>();

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public void removeUser(User user) {
    users.remove(user);
  }

  @Override
  public void sendMessage(User sender, String message, User receiver) {
    if (users.contains(sender) && users.contains(receiver)) {
      receiver.receiveMessage(sender, message);
    } else {
      System.out.println("User not found");
    }
  }
}
