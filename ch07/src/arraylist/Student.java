package arraylist;

import java.util.ArrayList;

public class Student {
	private static int serialNo = 1000;
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList; // 과목을 저장하는 객체 배열 변수 선언

	// 학생의 이름을 매개변수로 갖는 생성자
	public Student(String studentname) {
		this.studentID = ++serialNo;
		this.studentName = studentname;
		subjectList = new ArrayList<Subject>();// 과목을 생성 합니다.
	}

	// 학생이 수강하는 과목을 과목 리스트에 하나씩 추가하는 매소드
	public void addSubject(String Name, int Score) {
		// 과목을 생성 합니다.
		Subject subject = new Subject(); // 과목 생성
		subject.setSubjectName(Name); // 과목 명 설정
		subject.setSubjectScore(Score); // 과목 점수 설정
		subjectList.add(subject); // 과목 리스트에 1개의 과목 추가
	}
	// 과목 명 과 과목 점수를 출력 하는 메소드

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
