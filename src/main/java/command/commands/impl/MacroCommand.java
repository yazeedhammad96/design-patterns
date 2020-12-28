package command.commands.impl;

import command.commands.Command;

import java.util.List;

public class MacroCommand implements Command {

  List<Command> commands;

  public MacroCommand(List<Command> commands) {
    this.commands = commands;
  }

  @Override
  public void execute() {
    commands.forEach(Command::execute);
  }

  @Override
  public void undo() {
    commands.forEach(Command::undo);
  }
}
