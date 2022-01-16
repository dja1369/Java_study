package arraylist.pdd;

import java.util.ArrayList;

import arraylist.Subject;

public class Student {
	private static int serialNo = 1000;
	private String studentName;
	private int studentID;
	ArrayList<Subject> subjectList;
	
	
	
	public Student(String studentName) {
		this.studentName = studentName;
		this.studentID = ++serialNo;
		subjectList = new ArrayList<Subject>();
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setSubjectScore(score);
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int sum = 0;
		for (Subject sub : subjectList) {
			System.out.println("학생 번호:" + studentID + "  학생 이름:" + studentName + "  과목 명:" + sub.getSubjectName()
					+ "  성적은:" + sub.getSubjectScore() + "점 입니다 총점은 ");
			sum += sub.getSubjectScore(); //과목별 점수 누적.
		}
		System.out.println(sum+ "  입니다.");
	}
	}
	
	

