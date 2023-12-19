package mediator.demo1;

public class ChatApp {
  public static void main(String[] args) {
    ChatMediator chatRoom = new ChatRoom();

    User user1 = new ChatUser("User 1", chatRoom);
    User user2 = new ChatUser("User 2", chatRoom);
    User user3 = new ChatUser("User 3", chatRoom);

    user1.sendMessage("Hi User 2", user2);
    user2.sendMessage("Hello User 1", user1);
  }
}
