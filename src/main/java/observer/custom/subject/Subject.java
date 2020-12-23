package observer.custom.subject;


import observer.custom.observer.Observer;

public interface Subject {
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
