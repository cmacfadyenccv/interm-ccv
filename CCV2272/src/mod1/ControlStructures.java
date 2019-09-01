/**
 * Review of control structures from an introductory course in Java, e.g. CCV CIS2271
 * Introduction to switch
 * 
 * @author C MacFadyen
 */

package mod1;

public class ControlStructures {

	public static void main(String[] args) {
		int num = 42;
		String state = "New Jersey";
		boolean isOpen = true;

		switch (state) {

		case "New York":
			System.out.println("Empire State");
			break;

		case "California":
			System.out.println("Golden State");
			break;

		case "Vermont":
			System.out.println("Green Mountain State");
			break;

		default:
			System.out.println("Some random state");
		}
	}

}
