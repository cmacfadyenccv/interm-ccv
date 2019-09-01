/**
 * Review of loops from an introductory course in Java, e.g. CCV CIS2271
 * 
 * @author C MacFadyen
 */
package mod1;

public class Loops {

	public static void main(String[] args) {
		
		int time = 36;
		
		for(time = 36; time > 0; time -= 4) {		
			if(time == 20) {
				continue; //go to next iteration if time is 20
			}
			System.out.println("Time left: " + time);
		};
			
		System.out.println(time);

	}

}
