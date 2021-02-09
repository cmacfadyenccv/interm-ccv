package mod3;

public class StudentTester {

	public static void main(String[] args) {
		CCVstudent c = new CCVstudent(100, "Charlie Brown");
		System.out.println(CCVstudent.NUM_STUDENTS);
		CCVstudent d = new CCVstudent(101, "Sponge Bob");
		System.out.println(CCVstudent.NUM_STUDENTS);
		CCVstudent e = new CCVstudent("Peppermint Patty");
		System.out.println(CCVstudent.NUM_STUDENTS);
		
		CCVstudent.printMotto();
		Math.max(9, 7);
		System.out.println(CCVstudent.MAX_NAME_LENGTH);

//		d.setName("Olive Oyl");
//		System.out.println(c.getName());
//
//		System.out.println(c);
//		System.out.println(d);
//
//		System.out.println("The difference in id's is: " + c.compareTo(d));
//		System.out.println("The difference in id's is: " + d.compareTo(c));
//
//		Classroom classroom = new Classroom(c);
//		System.out.println(classroom.getClassPresident());
//
//		classroom.increaseId(d);
//		System.out.println("The id of the object that was passed is " +
//				d.getId());


	}

}
