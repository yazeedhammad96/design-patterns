package command.commands.impl;

import command.commands.Command;
import command.reveiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanOffCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.setSpeed(CeilingFan.OFF);
    System.out.println(String.format("Execute Fan OffSpeed with PrevSpeed:[%s] and Speed:[%s]", prevSpeed, ceilingFan.getSpeed()));
  }

  @Override
  public void undo() {
    int temp = ceilingFan.getSpeed();
    ceilingFan.setSpeed(prevSpeed);
    prevSpeed = temp;
    System.out.println(String.format("Undo Fan OffSpeed with PrevSpeed:[%s] and Speed:[%s]", prevSpeed, ceilingFan.getSpeed()));

  }
}
