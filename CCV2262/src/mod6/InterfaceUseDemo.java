package mod4;

public class InterfaceUseDemo implements InterfaceDemo{

	public void knob1Increase(double amtInc) {
		System.out.println("knob 1 increased by " + amtInc);
		
	}

	public void knob1Decrease(double amtDec) {
		System.out.println("knob 1 decreased by " + amtDec);
		
	}

	public String pad1Pressed(double velocity) {
		
		return "Playing sound at " + velocity + " level";
	}

	public void pad1Released() {
		
		
	}

	public String progSelectPushed() {
		System.out.println("Setting program");
		return "Program set";
	}
	
	public void showMaxVolume() {
		
		System.out.println(maxVolume);
	}

}
