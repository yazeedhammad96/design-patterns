package command.commands.impl;

import command.commands.Command;
import command.reveiver.CeilingFan;

public class CeilingFanLowCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanLowCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.setSpeed(CeilingFan.LOW);
    System.out.println(String.format("Execute Fan LowSpeed with PrevSpeed:[%s] and Speed:[%s]", prevSpeed, ceilingFan.getSpeed()));
  }

  @Override
  public void undo() {
    int temp = ceilingFan.getSpeed();
    ceilingFan.setSpeed(prevSpeed);
    prevSpeed = temp;
    System.out.println(String.format("Undo Fan LowSpeed with PrevSpeed:[%s] and Speed:[%s]", prevSpeed, ceilingFan.getSpeed()));

  }
}
