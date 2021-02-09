package mod3;

public class Classroom {

	//field
	private CCVstudent president;

	//constructor
	public Classroom(CCVstudent president) {
		this.president = president;
	}

	public CCVstudent getClassPresident(){
		return president; //returns a reference
	}

	public void increaseId(CCVstudent student) {
		int id = student.getId();
		student.setId(id + 10);
		System.out.println("Inside of increaseId, id is: " + student.getId());
	}
}



