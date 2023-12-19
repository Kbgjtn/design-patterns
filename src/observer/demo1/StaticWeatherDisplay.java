package observer.demo1;

public class StaticWeatherDisplay implements WeatherDisplay {
  public void update(String newWeather) {
    System.out.println("Static Weather Display updated. Current weather: " + newWeather);
  }
}
