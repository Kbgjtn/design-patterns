package observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
  private List<User> users = new ArrayList<>();
  private List<String> messages = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  public void removeUser(User user) {
    users.remove(user);
  }

  public void sendMessage(String message) {
    messages.add(message);
    notifyUsers(message);
  }

  public void notifyUsers(String message) {
    for (User user : users) {
      user.update(message);
    }
  }
}
