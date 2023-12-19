package mediator.demo1;

public class ChatUser implements User {
  private String name;
  private ChatMediator chatMediator;

  public ChatUser(String name, ChatMediator chatMediator) {
    this.name = name;
    this.chatMediator = chatMediator;
    chatMediator.addUser(this);
  }

  @Override
  public void sendMessage(String message, User receiver) {
    chatMediator.sendMessage(this, message, receiver);
  }

  @Override
  public void receiveMessage(User sender, String message) {
    System.out.println(name + " sent message: " + message);
  }

  public String getName() {
    return name;
  }
}
