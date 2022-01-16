package arraylist;

import java.util.ArrayList;

import array.alone.Student;

public class StudentArrayListTest {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student("1001", "James");
		Student student2 = new Student("1002", "Tomas");
		Student student3 = new Student("1003", "Edward"); 
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			student.ShowInfo();
		}
		for(Student stu : studentList) {
			stu.ShowInfo();
		}
		
	}

}
