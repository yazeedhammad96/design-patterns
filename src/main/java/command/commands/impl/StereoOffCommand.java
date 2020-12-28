package command.commands.impl;

import command.commands.Command;
import command.reveiver.Stereo;

public class StereoOffCommand implements Command {
  private Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
  }
}
