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
		Student std1 = new Student(1000,"���Ϲ�", korean);
		Student std2 = new Student(1001,"���̹�", math);
		Student std3 = new Student(1002,"�̻��", english);
		Student std4 = new Student(1003,"�ڻ��", aboutAnimal);

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
		System.out.println("�й��� �Է��ϼ���");
		ID = scan.nextInt();
		System.out.println(ID + " �л��� ������");
		if (ID == 1000) {
			System.out.println(" ���� �� ������ : " + std1.getScoreList() + " �� �Դϴ�");
			System.out.println(" ���� �� ������  ���� : " + calc.getGrade(90) + " ���� : " + calc.getGrade(80)+ " ���� �� : " + calc.getGrade(90));
		} else if (ID == 1001) {
			System.out.println(" ���� �� ������ : " + std2.getScoreList() + " �� �Դϴ�");
			System.out.println(" ���� �� ������  ���� : " + calc.getGrade(89) + " ���� : " + calc.getGrade(97)+ " ���� �� : " + calc.getGrade(92));
				} else if (ID == 1002) {
			System.out.println(" ���� �� ������ : " + std3.getScoreList() + " �� �Դϴ�");
			System.out.println(" ���� �� ������  ����  : " + calc.getGrade(100) + " ���� : " + calc.getGrade(80));
			} else if (ID == 1003) {
			System.out.println(" ���� �� ������ : " + std4.getScoreList() + " �� �Դϴ�");
			System.out.println(" ���� �� ������  ������ : " + calc.getGrade(97) + " ���� : " + calc.getGrade(70));
			} else {
			System.out.println(" ���� ���� �ʴ� �л� �Դϴ�.");
		}
	}
}
