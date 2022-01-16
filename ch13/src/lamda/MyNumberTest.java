package lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		//람다식을 인터페이스 타입의 변수에 대입
		MyNumber max = (x,y) -> (x > y) ? x:y; //getMaxNum의 구현부
		
		int maxNum = max.getMaxNum(100, 200); //인터페이스 타입의 변수로 구현된 메소드 호출
		System.out.println(maxNum);
		
		//익명 개체를 생성하는 익명 내부 클래스 
		MyNumber myNum = new MyNumber() {
			//이름이 없는 클래스 생성됨
			@Override
			public int getMaxNum(int num1, int num2) { //추상 메소드 구현
				int maxNumber = (num1>num2) ? num1: num2;
				return maxNum;
			}
		};
		
		System.out.println(myNum.getMaxNum(100, 200));
	
	}

}
