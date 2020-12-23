package observer.custom.subject.impl;

import observer.custom.model.WeatherStatus;
import observer.custom.observer.Observer;
import observer.custom.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject {

  private WeatherStatus weatherStatus;
  private List<Observer> observers;

  public WeatherDataSubject() {
    observers = new ArrayList<>();
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    observers.forEach(observer -> observer.update(weatherStatus));
  }

  public WeatherStatus getStatus() {
    return weatherStatus;
  }

  public void setStatus(WeatherStatus weatherStatus) {
    this.weatherStatus = weatherStatus;
    notifyObservers();
  }

}
