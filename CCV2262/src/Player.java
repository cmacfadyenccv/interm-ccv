package mod3;

public abstract class Player {

	//instance data
	String name;
	int jerseyNumber;
	
	public Player(String name, int jerseyNumber) {
		this.name = name;
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	//provides method header that must be used in all subclasses
	public abstract String toString();
}
