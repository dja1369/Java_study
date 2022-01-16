package arraylist.pdd;


public class StudentSubjectTest {

	public static void main(String[] args) {
		
		Student Lee = new Student("Lee");
		Student Kim = new Student("Kim");
		Lee.addSubject("국어",100);
		Lee.addSubject("수학",50);
		Kim.addSubject("국어",70);
		Kim.addSubject("수학",85);
		Kim.addSubject("영어",100);
		Lee.showStudentInfo();
		Kim.showStudentInfo();
	}

}
