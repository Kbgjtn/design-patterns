package state.demo;

public class RedLightState implements TrafficLightState {
  @Override
  public void handle() {
    System.out.println("Red Light - Stop");
  }
}
