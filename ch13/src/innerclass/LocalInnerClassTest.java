package innerclass;

class Outer{
	int outerNum = 100; 	//인스턴스 변수 
	static int sNum = 200; 	//스태틱 변수 , 정적 변수
	
	Runnable getRunnable(int i) {//타입을 반환하는 메소드
		int localNum = 300; //지역 변수
		
		class MyRunnable implements Runnable{// 지역 내부 클래스
			int iNum = 1;//지역 내부 클래스의 인스턴스 변수
			@Override
			public void run() {
				//메소드 의 매개변수와 지역변수는 참조는 가능하나 변경은 불가능한 final 로 컴파일러가 변경함
			//	localNum += 300 오류 
				//i += 1000; // 변경은 불가능 final field 로 변경됨
				System.out.println(" i : " + i); //매개변수 를 참조
				System.out.println(" localNum : " + localNum);//지역변수를 참조
				System.out.println(" iNum : " + iNum);
				System.out.println(" outerNum : " + outerNum);
				System.out.println(" sNum : " + sNum);
			}	
		}
		//지역 내부 클래스의 이름은 클래스를 생성해서 반환 할때만 사용
		return new MyRunnable();	//Runnable 을 구현한 MyRunnable 객체를 생성하여 반환;
	}
}


public class LocalInnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(1000);
		runnable.run();
	}

}
