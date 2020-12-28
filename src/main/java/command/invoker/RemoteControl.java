package command.invoker;

import command.commands.Command;
import command.commands.impl.NoCommand;

import java.util.Arrays;

public class RemoteControl {

  private Command[] onCommands;
  private Command[] offCommands;
  private Command undo;

  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];
    Command noCommand = new NoCommand();
    Arrays.fill(onCommands, noCommand);
    Arrays.fill(offCommands, noCommand);
    undo = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasBushed(int slot) {
    onCommands[slot].execute();
    undo = onCommands[slot];
  }

  public void offButtonWasBushed(int slot) {
    offCommands[slot].execute();
    undo = offCommands[slot];

  }

  public void undoButtonWasBushed() {
    undo.undo();
  }

  @Override
  public String toString() {
    return "RemoteControl{" +
        "onCommands=" + Arrays.toString(onCommands) +
        ", offCommands=" + Arrays.toString(offCommands) +
        '}';
  }
}
