package arraylist.pdd;


public class StudentSubjectTest {

	public static void main(String[] args) {
		
		Student Lee = new Student("Lee");
		Student Kim = new Student("Kim");
		Lee.addSubject("����",100);
		Lee.addSubject("����",50);
		Kim.addSubject("����",70);
		Kim.addSubject("����",85);
		Kim.addSubject("����",100);
		Lee.showStudentInfo();
		Kim.showStudentInfo();
	}

}
