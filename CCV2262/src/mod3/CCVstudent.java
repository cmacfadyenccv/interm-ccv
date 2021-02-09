/**
 * Sample class for reviewing methods and classes
 * 
 * @author C MacFadyen
 */

package mod3;

public class CCVstudent {

	//instance data, fields, instance variables
	private int id;
	private String name;
	private static String schoolName = "CCV";
	public final static int MAX_NAME_LENGTH = 30;
	public static int NUM_STUDENTS = 0;
	
	
	


	//constructors
	public CCVstudent() {
		
	}
	public CCVstudent(int id, String name) {
		if(checkIfValid(id)) {
			this.id = id;
		}
		else {
			this.id = -1;
		}

		this.name = name;
		NUM_STUDENTS++;
	}
	
	public CCVstudent(String name) {
		this.name = name;
		NUM_STUDENTS++;
	}

	private boolean checkIfValid(int id) {

		if(id>0) {
			return true;
		}

		return false;
	}

	//accessors and mutators (getters and setters)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(CCVstudent otherStudent) {
		//difference in id's
		return this.id - otherStudent.id;
	}
	
	public static void printMotto() {
		System.out.println("We are CCV!");
		System.out.println(schoolName);
	}
	/**toString provides a String representation of an object.
	 *  It is called by default by print and println
	 *  in System.in
	 *  For example, if c is an instance of CCVStudent (or any Object)
	 *  System.out.println(c); is equivalent to
	 *  System.out.println(c.toString());
	 */

	public String toString() { return ("ID: " + id + "\nName: " + name); }


}
