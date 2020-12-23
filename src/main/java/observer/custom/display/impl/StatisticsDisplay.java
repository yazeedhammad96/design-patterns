package observer.custom.display.impl;

import observer.custom.display.DisplayElement;
import observer.custom.model.WeatherStatus;
import observer.custom.observer.Observer;
import observer.custom.subject.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {

  private Subject weatherDataSubject;
  private WeatherStatus weatherStatus;

  public StatisticsDisplay(Subject weatherDataSubject) {
    this.weatherDataSubject = weatherDataSubject;
    weatherDataSubject.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("[StatisticsDisplay]: " + weatherStatus.toString());
  }

  @Override
  public void update(WeatherStatus weatherStatus) {
    this.weatherStatus = weatherStatus;
    display();
  }
}
