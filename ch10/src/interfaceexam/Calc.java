package interfaceexam;

public interface Calc {
	double PI = 3.14; //public static final 이 생략 되어있음
	int ERROR = -99999999;
	
	default void describe() { //default : 구현 내용이 있음
		method(); // private 메소드 호출
		System.out.println("정수 계산기를 구현 했습니다.");
	}
	
	static int total(int[] array) { //정적 매소드 : 인스턴스의 생성과 무관함
		staticMethod(); // private 정적 메소드 호출
		int total =0;
		//배열 요소의 합계를 구하는 향상된 for 문
		for (int i : array) {
			total += i;
		}
		return total;
	}
	private void method() { //private 메소드 : 인터페이스 내부 에서만 사용가능
		System.out.println("Calc private void method()");
	}
	
	private static void staticMethod() {//private 정적 메소드 : 인터페이스 내부 에서만 사용가능한 정적 메소드
		System.out.println("private static void staticMethod()");
	}
	
	int add(int num1 , int num2); // 선언 만 되어 있음 (추상 매소드)
	int subtract(int num1 , int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	int mod(int num1 , int num2);
	int square(int num1);

}
