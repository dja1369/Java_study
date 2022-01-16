package daily_life_coding_School;

import java.util.ArrayList;

public class Subject {
	private int SubjectID;
	private String SubjectName;
	private int gradeType;
	private ArrayList<Student> studentList = new ArrayList<Student>();

	
	public Subject(int subjectID, String subjectName) {
		SubjectID = subjectID;
		SubjectName = subjectName;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public int getSubjectID() {
		return SubjectID;
	}
	public void setSubjectID(int subjectID) {
		SubjectID = subjectID;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	
	
}
