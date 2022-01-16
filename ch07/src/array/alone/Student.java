package array.alone;

public class Student {
	private String studentID;
	public static int CoedName = 2001;
	public int CordName;
	private String name;
	
	
	public Student(String studentID, String name ) {
		this.studentID = studentID;
		this.name = name;
		this.CordName= CoedName++;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void ShowInfo() {
		System.out.println(studentID + "," + name + "," + CordName+" = ÇÐ¹ø");
	}
	
}
