/**
 * Review of data types from an introductory course in Java, e.g. CCV CIS2271
 * Introduction to some new types
 * 
 * @author C MacFadyen
 */

package mod1;

import java.awt.Rectangle;
import java.util.Random;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {

		primitiveTypes();
		//referenceTypes();
		//convertTypes();
		//operations();


	}

	/**
	 * Demonstrates primitive types in Java
	 * Introduces options other than int for integer types
	 * and float as well as double for floating-point
	 */

	private static void primitiveTypes() {
		boolean isOpen = false;

		char firstInitial = 'c'; //note the single quotes

		//Integer types
		int age = 34;
		long longAge = 236475537575L;  //note the l (or L) at the end
		short shortAge = 34;
		byte byteAge = 127;
		long anotherLong = age;


		//Floating-point types (numbers with decimal points)
		double speed = 45.8;
		float floatSpeed = 58.4f; //note the f (or F) for float

		System.out.println(anotherLong); //change to see other output

	}

	/**
	 * Demonstrates reference types in Java
	 * Reference types are objects built from classes
	 */
	private static void referenceTypes() {

		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		Rectangle rect = new Rectangle(5, 8, 20, 30);

		String s = new String("Strings are sequences of characters");
		String easyWay = "This is a shortcut notation for the line above";

		CCVstudent student = new CCVstudent(12345, "Jane Doe"); 	//we would need to write a class here
		
		Object o = (Object)student; //casting a reference type
		System.out.println(rect.x);
	}



	private static void convertTypes() {
		int x = 87;
		double y = 54.7;
		char z = 'A'; //the character 9

		y = x;
		x = z;
		x = (int)y;
		x = z;
		
		System.out.println(x);
	}
	
	private static void operations() {
		//arithmetic
		int result = 22 / 5; //integer division
		result = 22 % 5; //modulus (mod) is remainder
		result = 9 + 22 / 5; //order of operations
		System.out.println(result);
		
		
		//String concatenation
		String stem = "The answer is: ";
		System.out.println(stem + (3 + 7));
		
	}
}
