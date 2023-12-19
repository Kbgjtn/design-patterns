package observer.demo1;

public class ForecastDisplay implements WeatherDisplay {
  public void update(String newWeather) {
    System.out.println("Forecast Display updated. Weather forecast: " + newWeather);
  }
}
