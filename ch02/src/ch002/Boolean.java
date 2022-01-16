package ch002;

public class Boolean {

	public static void main(String[] args) {
		
		boolean isMarried;
		isMarried = false;
		System.out.println(isMarried);
		
		// 자료형 추론 자바 10버전 부터 사용 가능
		// 변수에 대입되는 자료형을 컴파일러가 추측하여 자료형을 인지 
		
		var Num = 100;
		System.out.println(Num);
		
		var dNum = 3.14;
		System.out.println(dNum);

		var str = "student";
		System.out.println(str);
	}

}
