package daily_life_coding_School;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateValue {

	ArrayList<Student> studentList = new ArrayList<Student>();
	School javaSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject english;
	Subject aboutAnimal;

	public void addStudentScore(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentID(), subject, point);
		student.addSubjectScore(score);
	}

	public void creatSubject() {
		korean = new Subject(2000, "Korean");
		math = new Subject(2001, "Math");
		english = new Subject(2002, "English");
		aboutAnimal = new Subject(2003, "AboutAnimal");
		javaSchool.addSubject(korean);
		javaSchool.addSubject(math);
		javaSchool.addSubject(english);
		javaSchool.addSubject(aboutAnimal);
	}

	public void createStudent() {
		Student std1 = new Student(1000,"김일번", korean);
		Student std2 = new Student(1001,"최이번", math);
		Student std3 = new Student(1002,"이삼번", english);
		Student std4 = new Student(1003,"박사번", aboutAnimal);

		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		studentList.add(std4);
		javaSchool.addStudent(std1);
		javaSchool.addStudent(std2);
		javaSchool.addStudent(std3);
		javaSchool.addStudent(std4);

		korean.setStudentList(studentList);
		math.setStudentList(studentList);
		english.setStudentList(studentList);
		aboutAnimal.setStudentList(studentList);

		addStudentScore(std1, korean, 90);
		addStudentScore(std1, math, 80);
		addStudentScore(std1, aboutAnimal, 90);
		addStudentScore(std2, math, 89);
		addStudentScore(std2, english, 97);
		addStudentScore(std2, aboutAnimal, 92);
		addStudentScore(std3, english, 100);
		addStudentScore(std3, korean, 80);
		addStudentScore(std4, aboutAnimal, 97);
		addStudentScore(std4, math, 70);

		Scanner scan = new Scanner(System.in);
		int ID;
		MajorSubjectCalc calc = new MajorSubjectCalc();
		System.out.println("학번을 입력하세요");
		ID = scan.nextInt();
		System.out.println(ID + " 학생의 성적은");
		if (ID == 1000) {
			System.out.println(" 전공 별 점수는 : " + std1.getScoreList() + " 점 입니다");
			System.out.println(" 전공 별 학점은  국어 : " + calc.getGrade(90) + " 수학 : " + calc.getGrade(80)+ " 동물 학 : " + calc.getGrade(90));
		} else if (ID == 1001) {
			System.out.println(" 전공 별 점수는 : " + std2.getScoreList() + " 점 입니다");
			System.out.println(" 전공 별 학점은  수학 : " + calc.getGrade(89) + " 영어 : " + calc.getGrade(97)+ " 동물 학 : " + calc.getGrade(92));
				} else if (ID == 1002) {
			System.out.println(" 전공 별 점수는 : " + std3.getScoreList() + " 점 입니다");
			System.out.println(" 전공 별 학점은  영어  : " + calc.getGrade(100) + " 국어 : " + calc.getGrade(80));
			} else if (ID == 1003) {
			System.out.println(" 전공 별 점수는 : " + std4.getScoreList() + " 점 입니다");
			System.out.println(" 전공 별 학점은  동물학 : " + calc.getGrade(97) + " 수학 : " + calc.getGrade(70));
			} else {
			System.out.println(" 존재 하지 않는 학생 입니다.");
		}
	}
}
