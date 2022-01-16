package ifexample;

public class ifExam1 {

	public static void main(String[] args) {

		var age = 7;

		if (age >= 8) {
			System.out.println("학교에 다닙니다");
		} else {
			System.out.println("학교에 안다닙니다.");
		}
		// 남성, 여성 조건에 따라 출력하기
		var gender = 'F';
		if (gender == 'M') {
			System.out.println("남자입니다");
		} else {
			System.out.println("여자겠네요.");
		}
	}
}