package mod2;

//import CCVstudent class from mod1 package
import mod1.CCVstudent;

public class Arrays {

	public static void main(String[] args) {
		//Declare and instantiate an array of ints
		int[] numbers = new int[5]; //indexed from 0 to 4
		numbers[3] = 8; //sets the FOURTH element to 8
		printArray(numbers);
		
		//Use an initialization list
		int[] ages = {12, 35, 35, 20, 10, 8, 72};
		//printArray(ages);
		printWithForEach(ages); //demonstrates for-each
		
		//set value of one array to another array
		int[] otherAges = ages;  //value of object is reference to memory location
		otherAges[0] = 11;
		ages[2] = 40;
		//printArray(otherAges);  //conclusion: otherAges and ages are the SAME array
		//printArray(ages);
		
		
		//Two-dimensional array
		int[][] points = {{0,0}, {3,8}, {-5,6}, {10,-2}};
		
		//Printing requires two loops
		System.out.print("["); //opening bracket for points
		for(int x = 0; x < points.length; x++) { //outer loop
			System.out.print("["); //opening bracket for inner loop
			for(int y = 0; y < points[x].length; y++) { //inner loop
				System.out.print(points[x][y]+ " ");
			}
			System.out.print("]"); //final bracket for inner array
		}
		System.out.println("]\n"); //final bracket for points array

		//array of objects
		CCVstudent[] students =new CCVstudent[4];
		students[0] = new CCVstudent(1234, "Karen Archibald");
		students[2] = new CCVstudent(2345, "Chuck Todd");
		printArray(students);

	}
	/**
	 * Prints an array of integers
	 * @param theArray the array to print
	 */
	
	private static void printArray(int[] theArray) {
		//print opening bracket
		System.out.print("[ "); 
		
		//print each array element
		for(int i = 0; i< theArray.length; i++) {
			System.out.print(theArray[i] + " ");
		}
		//print closing bracket and a new line
		System.out.println("]\n");
	}
	
	/**
	 * Prints an array of objects
	 * @param theArray the array to print
	 */
	
	private static void printArray(Object[] theArray) {
		//print opening bracket
		System.out.print("[ "); 
		
		//print each array element
		for(int i = 0; i< theArray.length; i++) {
			System.out.println(theArray[i] + " \n");
		}
		//print closing bracket and a new line
		System.out.println("]\n");
	}
	/**
	 * Demonstrates a "for-each" loop
	 * @param theArray the array to print
	 */
	private static void printWithForEach(int[] theArray) {
		//print opening bracket
				System.out.print("[ "); 
				
				//print each array element
				for(int num : theArray) {
					System.out.print(num + " ");
				}
				//print closing bracket and a new line
				System.out.println("]\n");
	}

}
