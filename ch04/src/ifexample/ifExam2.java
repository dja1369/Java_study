package ifexample;

public class ifExam2 {

	public static void main(String[] args) {

		var score = 81;
		String grade;

		if (score <= 60) {
			grade = "D";
			System.out.println("성적은 " + grade + "입니다");
		} else if (score <= 70) {
			grade = "C";
			System.out.println("성적은 " + grade + "입니다");
		} else if (score <= 80) {
			grade = "B";
			System.out.println("성적은 " + grade + "입니다");
			}
		else{
		grade = "A";
		System.out.println("성적은 " + grade + "입니다");
	    }
		
		grade = (score >= 90 ) ? 'A' : (score >= 80) ? 'B' : 'C';
	}	}