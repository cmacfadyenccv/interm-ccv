package jul30;

//ROOM CLASS
public class Room {
 protected int mLength;
 protected int mWidth;
 
 public Room () {
     this.mLength = 10;
     this.mWidth = 20;
     System.out.println ("ROOM CONSTRUCTOR EXECUTED" );
     this.showRoom ( );
 }
 
 public void showRoom ( ) {
     System.out.println ( "Room Method - area is: " + ( mLength * mWidth ) );
 }
 
 public String toString() {
	 return "I am a room ";
 }
}