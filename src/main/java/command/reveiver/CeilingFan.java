package command.reveiver;

public class CeilingFan {
  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;
  String location;
  int speed;

  public CeilingFan(String location) {
    this.location = location;
    setSpeed(OFF);
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }
}

