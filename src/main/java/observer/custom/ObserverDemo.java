package observer.custom;

import observer.custom.display.impl.StatisticsDisplay;
import observer.custom.model.WeatherStatus;
import observer.custom.subject.impl.WeatherDataSubject;

public class ObserverDemo {
  public static void main(String[] args) {
    WeatherDataSubject subject = new WeatherDataSubject();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(subject);
    WeatherStatus weatherStatus = new WeatherStatus();
    weatherStatus.setHumidity(100);
    weatherStatus.setPressure(100);
    weatherStatus.setTemperature(100);
    subject.setStatus(weatherStatus);
  }
}
