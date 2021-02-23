package mod3;

public class SoccerGoalkeeper extends SoccerPlayer{

	//instance data
	private int saves;
	
	//constructor
	public SoccerGoalkeeper(String name, int jerseyNumber, int goals,
			int assists, int saves) {
		super(name, jerseyNumber, goals, assists);
		this.saves = saves;
	}
	
	public String toString() {
		return (name + " wears number " + jerseyNumber + " and has "
				+ saves + " saves this season."); 
	}
	
	public void printLogo() {
		super.printLogo();
		System.out.println("GOALIE!!");
	}
	
}
