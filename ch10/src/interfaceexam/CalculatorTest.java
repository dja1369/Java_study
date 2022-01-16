package interfaceexam;

public class CalculatorTest {

	public static void main(String[] args) {
		int[] intArray = new int[] {2,4,6,8,10};
		
		int sum = Calc.total(intArray);
		System.out.println(sum);
		
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc comCalc = new CompleteCalc();
		comCalc.showInfo();
		
		Calc calc = comCalc; // Upcasting , 타입캐스팅(형변환) , 묵시적 형 변환
		//calc.showInfo(); 오류 : 정의되어 있지 않음 , Calc 타입이 지원하지 않는 매소드
		
		calc.describe(); //디폴트 매소드 호출, 재정의가 된 경우 라면 재정의된 메소드가 호출됨
		
		System.out.println(comCalc.add(num1, num2));
		System.out.println(comCalc.subtract(num1, num2));
		System.out.println(comCalc.multiply(num1, num2));
		System.out.println(comCalc.divide(num1, num2)); // 몫
		System.out.println(comCalc.square(num1));
		num2 = 3;
		System.out.println(comCalc.mod(num1, num2)); //나머지 
		num2 =0;
		System.out.println(comCalc.divide(num1, num2));
	}

}
