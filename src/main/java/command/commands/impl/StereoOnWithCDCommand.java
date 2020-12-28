package command.commands.impl;

import command.commands.Command;
import command.reveiver.Stereo;

public class StereoOnWithCDCommand implements Command {
  private Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.setCd("Pop");
    stereo.setVolumed(11);
    stereo.on();
  }

  @Override
  public void undo() {
    stereo.off();
  }
}
