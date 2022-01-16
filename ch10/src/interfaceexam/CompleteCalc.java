package interfaceexam;

public class CompleteCalc extends Calculator {

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 == 0)
			return Calc.ERROR; // 인터페이스가 가진 상수값을 반환
		else
			return num1 / num2;
	}

	public int mod(int num1, int num2) {
		return num1 % num2;
	}
	public int square(int num1) {
		return num1 * num1;
	}
	//추가 기능 : 상속 되지 않은 이 클래스 만이 갖는 고유한 매서드
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현한 클래스 입니다.");
	}

	@Override
	public void describe() {
		System.out.println("완벽한 정수 계산기를 구현 했습니다...");
	}
	
	
}
