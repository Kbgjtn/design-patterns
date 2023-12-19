package state.demo;

public class YellowLightState implements TrafficLightState {
  @Override
  public void handle() {
    System.out.println("Yellow Light - Caution");
  }
}
