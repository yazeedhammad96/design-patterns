package command.reveiver;

public class Stereo {

  private String facility;

  public Stereo(String facility) {
    this.facility = facility;
  }

  public void on() {
    System.out.println(facility + " Stereo is On!");
  }

  public void off() {
    System.out.println(facility + " Stereo is Off!");
  }

  public void setCd(String cd) {
    System.out.println(String.format("%s Cd [%s] has been set!", facility, cd));
  }

  public void setVolumed(Integer volume) {
    System.out.println(String.format("%s Volume [%s] has been set!", facility, volume));
  }

}
