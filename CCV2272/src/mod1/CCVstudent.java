/**
 * Sample class for uses with data type review
 * 
 * @author C MacFadyen
 */

package mod1;

public class CCVstudent {

	//instance data
	private int id;
	private String name;
	
	//constructor
	public CCVstudent(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	
}
