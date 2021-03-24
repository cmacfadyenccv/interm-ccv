package mod6;

public interface InterfaceDemo {

	//data
	public final int maxVolume = 127;
	
	//abstract methods
	public void knob1Increase(double amtInc);
	public void knob1Decrease(double amtDec); 
	public String pad1Pressed(double velocity);
	public void pad1Released();
	public String progSelectPushed();
	
}
