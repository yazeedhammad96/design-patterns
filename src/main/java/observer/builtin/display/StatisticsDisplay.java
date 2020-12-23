package observer.builtin.display;

import observer.custom.display.DisplayElement;
import observer.custom.model.WeatherStatus;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {

  private Observable weatherDataSubject;
  private WeatherStatus weatherStatus;

  public StatisticsDisplay(Observable weatherDataSubject) {
    this.weatherDataSubject = weatherDataSubject;
    weatherDataSubject.addObserver(this);
  }

  @Override
  public void display() {
    System.out.println("[StatisticsDisplay]: " + weatherStatus.toString());
  }


  @Override
  public void update(Observable o, Object arg) {
    this.weatherStatus = (WeatherStatus) arg;
    weatherStatus.setHumidity(0);
    weatherStatus.setPressure(0);
    display();
  }
}
