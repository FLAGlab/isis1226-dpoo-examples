package OObasics;

public class Student {
	//Attributes
	private String name;
	private float[] marks;
	
	//Constructor
	public Student(String name, int numberOfAssignments) {
		this.name = name;
		this.marks = new float[numberOfAssignments];
	}
	
	//Methods
	public void addMark(int markNumber, float mark) {
		this.marks[markNumber] = mark;
	}

}
