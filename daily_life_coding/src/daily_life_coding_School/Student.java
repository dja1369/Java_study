package daily_life_coding_School;

import java.util.ArrayList;

public class Student {

	private int StudentID;
	int ID;
	private String StudentName;
	private Subject MajorSubject;
	private ArrayList<Score> ScoreList = new ArrayList<Score>();
		
	public Student(int studentID, String studentName, Subject majorSubject) {
		StudentID = studentID;
		StudentName = studentName;
		MajorSubject = majorSubject;
	}
	public void addSubjectScore(Score score) {
		ScoreList.add(score);
	}
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Subject getMajorSubject() {
		return MajorSubject;
	}
	public void setMajorSubject(Subject majorSubject) {
		MajorSubject = majorSubject;
	}
	public ArrayList<Score> getScoreList() {
		return ScoreList;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		ScoreList = scoreList;
	}
	
}
