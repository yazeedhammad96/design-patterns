package observer.builtin;


import observer.builtin.display.StatisticsDisplay;
import observer.builtin.subject.WeatherDataSubject;
import observer.custom.model.WeatherStatus;

public class ObserverDemo {

  public static void main(String[] args) {
    WeatherDataSubject subject = new WeatherDataSubject();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(subject);
    WeatherStatus weatherStatus = new WeatherStatus();
    weatherStatus.setHumidity(100);
    weatherStatus.setPressure(100);
    weatherStatus.setTemperature(100);
    subject.setStatus(weatherStatus);
    System.out.println(subject.countObservers());

    subject.notifyObservers();
  }
}
