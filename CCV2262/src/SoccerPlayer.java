package mod3;

public class SoccerPlayer extends Player{
//instance data
	
	protected int goals;
	protected int assists;
	
	//Constructor
	public SoccerPlayer(String name, int jerseyNumber, int goals, int assists) {
		super(name, jerseyNumber);
		this.goals = goals;
		this.assists = assists;
	}

	//Getters and setters

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	public void printLogo() {
		System.out.println(
				 name + " Number " + jerseyNumber +"\n"+
				 "▝ ▘ ▘ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖▗ ▖ ▘ \n"+
				 "                                                         ▖ \n"+
				 " ▘ ▘ ▘            ▗ ▖▗ ▖▗ ▗ ▘ ▖▝ ▝ ▘ ▘▗               ▗ ▘  \n"+
				 "▗      ▘▝ ▘▝ ▘▝ ▘▝         ▗▖      ▗ ▗  ▘▝ ▘▝ ▘▝ ▘▝ ▘▝     \n"+
				 "   ▘▝ ▗                  ▄████▙▄▝ ▘    ▖▝ ▝▗             ▖ \n"+
				 " ▖▘     ▗ ▖▗▐▌▘▝ ▗ ▗  ▄▟██▜▟▙█▛██▄▖ ▝    ▝ ▝█▖▗ ▖▗ ▖ ▖ ▖▘  \n"+
				 "    ▗▝     ▄█        █▜▛█▟██▜▙██▟█▜▙ ▝▝ ▘ ▘▝██▖            \n"+
				 "▗  ▖   ▝  ▟▜▀   ▖    ▌██▛█▜▟██▜▛█▟█▘ ▖ ▖▝▗▝ ▝▟█▌   ▗ ▗     \n"+
				 "      ▖  ▟█▀   ▖  ▗  ▝▐▙████▜▟██▛█▚ ▖ ▖ ▗ ▗▝ ▝▙█▌▝     ▝ ▘ \n"+
				 "▗▝ ▗▝   ▚█▞           ▚▜█▟█▟██▜▟█▛▘    ▖ ▖ ▖▘▖▝█▜▖ ▗ ▖▝    \n"+
				 "        ▟▌   ▝        ▝▟▜█▟▛█▟█▜▙▛ ▝ ▘ ▗  ▘ ▖▖▘▝██       ▖ \n"+
				 "  ▖  ▗▝▝█▘ ▖▘  ▗ ▘ ▝  ▗▝▘▘ ▝       ▗ ▖▘ ▝▗▝▗ ▖▘▘▀▞▌   ▖ ▘  \n"+
				 "▝   ▘         ▗      ▗    ▗       ▖    ▘▖▗▗▗▗ ▘▞▗▚▐ ▝      \n"+
				 "   ▖   ▝▗ ▗  ▗    ▖ ▖   ▖▝   ▖▝ ▘  ▝ ▘▘▗ ▖▗ ▖▝▖▖▚▐▝    ▖▗  \n"+
				 " ▘   ▝ ▝ ▗       ▘   ▗▝     ▘   ▗▝ ▗ ▖▝ ▖▗▗▗ ▘▖▐▐▝▌ ▗▝     \n"+
				 "▗  ▖▝   ▘   ▝  ▝   ▝    ▖▝ ▘ ▗▝   ▗  ▗▝ ▖▖▖▖▘▘▞▐▐▐▗▝     ▖ \n"+
				 "       ▘▝ ▘▗▄▄▙▄▄▄▙▖ ▘ ▘   ▗    ▘▗ ▗▝▗████████▗▚▚▚▘    ▝   \n"+
				 " ▖▘ ▗ ▘ ▝▗ ▖██████▛▙▖▗  ▖▝   ▘ ▘  ▗ ▗▟████████▚▚▐▖    ▖    \n"+
				 "         ▖▗ ████████▙▖ ▘  ▝ ▘ ▖ ▘▝  ▙█████████▚▚▚   ▗   ▘  \n"+
				 "▗ ▗▝  ▖▝  ▖▖███▜▟████▙▖▗ ▘▗ ▖▗ ▘ ▘▝▟████▙█████▚▚▘  ▘   ▖ ▗ \n"+
				 "          ▗ ▜██████▜██▙▖ ▖    ▗ ▘▞▟████████▙██▐▝  ▘   ▘    \n"+
				 "▗ ▗  ▘ ▗▝  ▝▖▜▛████████▀▝ ▘▘▀▝▖▘▘▝▜█████████▜▖▘  ▖  ▖▘  ▗  \n"+
				 "      ▗     ▝▗▐▀██████▝▗▘▚▘▌▘▚▗▘▌▚▘▝▜███▜▟▚▚▘▗ ▝   ▖       \n"+
				 " ▖ ▖▘    ▗▝    ▚▖▞▜▜▞▖▞▖▌▚▝▖▌▚▗▚▐▗▚▀▞▐▀▀▌▙▚▘      ▖    ▘ ▖ \n"+
				 "      ▘ ▗   ▗ ▖ ▝▝▞▞▖▌▞▞▐▐▐▝▞▞▞▖▌▚▐▐▐▐▐▜▝    ▖ ▘ ▘   ▝     \n"+
				 "▝ ▗ ▗  ▖   ▖   ▖▗▗ ▚▚▚▚▚▚▚▚▚▚▚▞▞▞▌▌▌▌▌▛▗▝▖▘▖▘ ▖ ▖  ▗▝   ▘  \n"+
				 "        ▗ ▘ ▝ ▘ ▘▖▚▘▌▜▐▞▟▟▐▟▞▟▞▟▟▞▙▜▀▌▌▌▚▝▗▗ ▘ ▖  ▘    ▘   \n"+
				 " ▘ ▖ ▝ ▗   ▗ ▗▝ ▘  ▗ ▘ ▝  ▘ ▝ ▝ ▖▝ ▖▘ ▖ ▖▝   ▖   ▘   ▖▘  ▝ \n"+
				 "▗   ▗     ▖       ▝   ▗  ▖ ▝ ▗ ▘            ▖  ▝  ▗▝    ▗  \n"+
				 "  ▗   ▝  ▖  ▗  ▖ ▘   ▗     ▖     ▗ ▗ ▘ ▖ ▖ ▘  ▝  ▗     ▗   \n"+
				 " ▖  ▗   ▖  ▗       ▖▝   ▝    ▖ ▖                ▗    ▖▘    \n"+
				 "      ▝       ▘ ▝                ▘    ▘   ▝  ▘ ▘    ▘    ▝ ");
	}
	/**Override toString method in Object to represent a 
	 * SoccerPlayer in a string (for printing).
	 */
	
	public String toString() {
		return (name + " wears number " + jerseyNumber + " and has "
				+ goals + " goals this season."); 
	}
	
}
