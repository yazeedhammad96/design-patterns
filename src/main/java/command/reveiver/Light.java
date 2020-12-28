package command.reveiver;

public class Light {

  private String facility;

  public Light(String facility) {
    this.facility = facility;
  }

  public void on() {
    System.out.println(facility + " Light is On!");
  }

  public void off() {
    System.out.println(facility + " Light is Off!");
  }
}
