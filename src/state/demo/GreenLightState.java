package state.demo;

public class GreenLightState implements TrafficLightState {
  @Override
  public void handle() {
    System.out.println("Green Light - Go");
  }
}
