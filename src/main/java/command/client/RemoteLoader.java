package command.client;

import command.commands.impl.*;
import command.invoker.RemoteControl;
import command.reveiver.CeilingFan;
import command.reveiver.Light;
import command.reveiver.Stereo;

import java.util.Arrays;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
    Light livingRoomLight = new Light("Living Room");
    Light kitchenRoomLight = new Light("Kitchen Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);

    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);

    Stereo stereoLivingRoom = new Stereo("Living Room");
    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereoLivingRoom);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereoLivingRoom);

    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
    remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);

    System.out.println(remoteControl);

    remoteControl.onButtonWasBushed(0);
    remoteControl.offButtonWasBushed(0);
    remoteControl.onButtonWasBushed(1);
    remoteControl.offButtonWasBushed(1);
    remoteControl.onButtonWasBushed(2);
    remoteControl.undoButtonWasBushed();
    remoteControl.onButtonWasBushed(2);

    System.out.println("---------Ceiling Fan -----------");
    CeilingFan ceilingFan = new CeilingFan("");
    CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
    CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
    remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);
    remoteControl.setCommand(4, ceilingFanLowCommand, ceilingFanOffCommand);

    remoteControl.onButtonWasBushed(3);
    remoteControl.undoButtonWasBushed();
    remoteControl.onButtonWasBushed(4);
    remoteControl.offButtonWasBushed(4);

    System.out.println("---------Macro Command -----------");

    MacroCommand partyOnCommand = new MacroCommand(Arrays.asList(ceilingFanHighCommand, livingRoomLightOn, kitchenRoomLightOn, stereoOnWithCDCommand));
    MacroCommand partyOffCommand = new MacroCommand(Arrays.asList(ceilingFanOffCommand, livingRoomLightOff, kitchenRoomLightOff, stereoOffCommand));
    remoteControl.setCommand(5, partyOnCommand, partyOffCommand);
    remoteControl.onButtonWasBushed(5);
    remoteControl.undoButtonWasBushed();
    remoteControl.onButtonWasBushed(5);
    remoteControl.offButtonWasBushed(5);
  }
}
