package observer.demo1;

public class CurrentWeatherDisplay implements WeatherDisplay {
  public void update(String newWeather) {
    System.out.println("Current Conditions Display updated. Current weather: " + newWeather);
  }
}
