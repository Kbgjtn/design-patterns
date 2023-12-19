package observer.demo2;

public class ChatApp {
  public static void main(String[] args) {
    ChatRoom chatRoom = new ChatRoom();

    User user1 = new ChatUser("User 1");
    User user2 = new ChatUser("User 2");

    chatRoom.addUser(user1);
    chatRoom.addUser(user2);

    chatRoom.sendMessage("Hi everyone!");
    chatRoom.sendMessage("How are you?");
    chatRoom.sendMessage("Everything is fine!");
  }
}
