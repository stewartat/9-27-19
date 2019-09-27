public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
  
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
  
		CeilingFanOnCommand ceilingFanOn = 
				new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = 
				new CeilingFanOffCommand(ceilingFan);
 
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		StereoOnWithCDCommand stereoOnWithCD =
				new StereoOnWithCDCommand(stereo);
		StereoOffCommand  stereoOff =
				new StereoOffCommand(stereo);
		
		HottubOnCommand Hottuboncommand = 
				new HottubOnCommand(hottub);
		HottubOffCommand Hottuboffcommand = 
				new HottubOffCommand(hottub);
		
		IncrementHottubTemperature IncrementhottubTemperature = 
				new IncrementHottubTemperature(hottub);
		DecrementHottubTemperature DecrementhottubTemperature = 
				new DecrementHottubTemperature(hottub);
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		remoteControl.setCommand(5, Hottuboncommand, Hottuboffcommand);
		remoteControl.setCommand(6, IncrementhottubTemperature, DecrementhottubTemperature);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(5);
		remoteControl.onButtonWasPushed(6);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(6);
		remoteControl.onButtonWasPushed(6);
		remoteControl.onButtonWasPushed(6);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(6);
		remoteControl.onButtonWasPushed(6);
		remoteControl.offButtonWasPushed(6);
		remoteControl.offButtonWasPushed(5);
		remoteControl.undoButtonWasPushed();
	}
}
