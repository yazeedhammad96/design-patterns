package observer.builtin.subject;

import observer.custom.model.WeatherStatus;

import java.util.Observable;

public class WeatherDataSubject extends Observable {

  private WeatherStatus weatherStatus;

  public WeatherStatus getStatus() {
    return weatherStatus;
  }

  public void setStatus(WeatherStatus weatherStatus) {
    this.weatherStatus = weatherStatus;
    setChanged();
    notifyObservers(weatherStatus);
  }
}
