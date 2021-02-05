package OObasics;

import java.util.Date;

public class ISIS1226 {
	//Attributes
	private int section;
	private String lecturer;
	private Date[] lectures; 
	private Student[] students;
	private String[] assignments;
		
	//Constructor(s)
	public ISIS1226(int section, String lecturer, Date[] lectures, int classSize, int numberOfAssignments) {
		this.section = section;
		this.lecturer = lecturer;
		this.lectures = lectures;
		Student[] students = new Student[classSize];
		for(int i=0; i<classSize; i++) 
			this.students[i] = new Student(Integer.toString(i), numberOfAssignments);
		this.students = students;
		this.assignments = new String[numberOfAssignments];
	}
	
	//Methods
	public void markAssignment(String assignment, float[] marks) {
		if(this.checkAssignment(assignment)) 
		for(int i=0; i<this.students.length; i++) {
			Student s = this.students[i];
			s.addMark(i, marks[i]);
		}
	}

	private boolean checkAssignment(String assignment) {
		boolean found = false;
		for(int i=0; i<this.assignments.length && !found; i++) {
			if(this.assignments[i].equals(assignment))
				found = true;
		}
		return found;
	}
	
	//main
	public static void main(String[] args) {
		Date[] lectures = {new Date(), new Date()};
		ISIS1226 course = new ISIS1226(2, "Nicolas", lectures, 12, 16);
		System.out.println(course.lecturer);
	}
}
