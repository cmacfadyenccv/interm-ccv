package mod5;

public class SoccerTeam {

	public static void main(String[] args) {
		SoccerPlayer playerOne = new SoccerPlayer("John Adams"  ,10, 4, 2);
		//test out goalie
		SoccerGoalkeeper goalie = new SoccerGoalkeeper("Ben White", 1, 0, 1, 5);
		playerOne.setGoals(6);
		//System.out.println(playerOne);
		//System.out.println(goalie);
		//playerOne.printLogo();
		//goalie.printLogo();
		
		//polymorphism
		//goalie is a SoccerGoalkeeper, also a SoccerPlayer, also a Player
		SoccerPlayer keeper = new SoccerGoalkeeper("Keeper", 1, 4, 4, 9);
		keeper.printLogo();
		
	}

}
