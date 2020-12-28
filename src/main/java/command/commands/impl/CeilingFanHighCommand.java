package command.commands.impl;

import command.commands.Command;
import command.reveiver.CeilingFan;

import java.util.function.Consumer;

public class CeilingFanHighCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }


  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.setSpeed(CeilingFan.HIGH);
    System.out.println(String.format("Execute Fan HighSpeed with PrevSpeed:[%s] and Speed:[%s]", prevSpeed, ceilingFan.getSpeed()));
  }

  @Override
  public void undo() {
    int temp = ceilingFan.getSpeed();
    ceilingFan.setSpeed(prevSpeed);
    prevSpeed = temp;
    System.out.println(String.format("Undo Fan HighSpeed with PrevSpeed:[%s] and Speed:[%s]", prevSpeed, ceilingFan.getSpeed()));

  }
}
