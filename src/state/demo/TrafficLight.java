package state.demo;

public class TrafficLight {
  private TrafficLightState state;

  public TrafficLight() {
    this.state = new RedLightState();
  }

  public void setState(TrafficLightState state) {
    this.state = state;
  }

  public void performAction() {
    this.state.handle();
  }
}
