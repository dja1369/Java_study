package daily_life_coding_School;

public class Score {
	public int StudentID;
	public int point;
	public Subject subject;
	
	public Score(int studentID, Subject subject,int point) {
		StudentID = studentID;
		this.point = point;
		this.subject = subject;
	}
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "[ÇÐ¹ø : " + StudentID + " , " + subject.getSubjectName() + " : " + point;
	}
	
	
}
