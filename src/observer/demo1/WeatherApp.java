package observer.demo1;

public class WeatherApp {
  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();

    WeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay();
    WeatherDisplay forecastDisplay = new ForecastDisplay();
    WeatherDisplay statisticsDisplay = new StaticWeatherDisplay();

    weatherStation.addObserver(currentWeatherDisplay);
    weatherStation.addObserver(forecastDisplay);
    weatherStation.addObserver(statisticsDisplay);

    System.out.println("----");
    weatherStation.setWeather("cloudy");
    System.out.println("----");
    weatherStation.setWeather("sunny");
    System.out.println("----");
    weatherStation.setWeather("rainy");
  }
}
