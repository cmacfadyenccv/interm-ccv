package mod3;

public class TicketSeller{
	
	public static void main(String[] args) {
		
		
		Ticket game = new Ticket();
		game.setEventName("Red Sox vs Yankees");
		game.setTicketPrice(120.00);
		game.setSeatRow('B');
		
		int seatNum = 2;
		for(int index = 0; index < 20; index++) {
			Ticket k = new Ticket("Red Sox vs. Yankees" , 120.00, 'B', seatNum);
			game.setSeatNum(seatNum);
			game.printOut();
			seatNum += 2;
		}
	}
	
}
