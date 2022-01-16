package arraylist;

import java.util.ArrayList;

public class Student {
	private static int serialNo = 1000;
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList; // ������ �����ϴ� ��ü �迭 ���� ����

	// �л��� �̸��� �Ű������� ���� ������
	public Student(String studentname) {
		this.studentID = ++serialNo;
		this.studentName = studentname;
		subjectList = new ArrayList<Subject>();// ������ ���� �մϴ�.
	}

	// �л��� �����ϴ� ������ ���� ����Ʈ�� �ϳ��� �߰��ϴ� �żҵ�
	public void addSubject(String Name, int Score) {
		// ������ ���� �մϴ�.
		Subject subject = new Subject(); // ���� ����
		subject.setSubjectName(Name); // ���� �� ����
		subject.setSubjectScore(Score); // ���� ���� ����
		subjectList.add(subject); // ���� ����Ʈ�� 1���� ���� �߰�
	}
	// ���� �� �� ���� ������ ��� �ϴ� �޼ҵ�

	public void showStudentInfo() {
		int sum = 0;
		for (Subject sub : subjectList) {
			System.out.println("�л� ��ȣ:" + studentID + "  �л� �̸�:" + studentName + "  ���� ��:" + sub.getSubjectName()
					+ "  ������:" + sub.getSubjectScore() + "�� �Դϴ� ������ ");
			sum += sub.getSubjectScore(); //���� ���� ����.
		}
		System.out.println(sum+ "  �Դϴ�.");
	}

}
