package observer.custom.observer;

import observer.custom.model.WeatherStatus;

public interface Observer {
  void update(WeatherStatus weatherStatus);
}
