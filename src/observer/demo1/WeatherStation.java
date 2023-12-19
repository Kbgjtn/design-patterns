package observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
  private List<WeatherDisplay> observers = new ArrayList<>();
  private String currentWeather;

  public void addObserver(WeatherDisplay observer) {
    observers.add(observer);
  }

  public void removeObserver(WeatherDisplay observer) {
    observers.remove(observer);
  }

  public void setWeather(String newWeather) {
    currentWeather = newWeather;
    notifyObservers();
  }

  public void notifyObservers() {
    for (WeatherDisplay observer : observers) {
      observer.update(currentWeather);
    }
  }
}
