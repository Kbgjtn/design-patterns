package state.demo;

public class Main {
  public static void main(String[] args) {
    TrafficLight trafficLight = new TrafficLight();

    trafficLight.performAction();

    System.out.println("--------------------");
    // change state to yellow
    trafficLight.setState(new YellowLightState());
    trafficLight.performAction();

    System.out.println("--------------------");
    // change state to green
    trafficLight.setState(new GreenLightState());
    trafficLight.performAction();
  }
}
