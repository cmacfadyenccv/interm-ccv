package jul30;

//KITCHEN CLASS
public class Kitchen extends Room {
 protected int mCounterHeight;

 public Kitchen ( int counterHeight ) {
     super ();
     this.mCounterHeight = counterHeight;
     System.out.println ("KITCHEN CONSTRUCTOR EXECUTED" );
     this.showRoom ( );
 }

 public void showRoom ( ) {
     System.out.println ( "Kitchen Method - counter height is: " + ( mCounterHeight ) );
 }
}