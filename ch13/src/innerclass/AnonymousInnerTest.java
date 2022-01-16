package innerclass;

class OuterClass{
	Runnable getRunnable(int i) {
		int localNum = 100;// 지역변수
		//익명 내부 클래스 , 이름을 생략하고 즉시 클래스를 생성함
		return new Runnable() {
			
			@Override
			public void run() {
				//i += 1; //상수화(final) 되기때문에 값을 변경할수 없음
				System.out.println(i);
				//localNum += 100; 상수화(final) 되기때문에 값 변경할수 없음
				System.out.println(localNum);
			}
		};
	}
	
	//익명 내부 클래스를 생성하여 변수에 대입
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() { //추상 메소드를 구현
			System.out.println("Runnable 타입을 구현한 Run() 메소드를 변수에 대입");

		}
	};
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.getRunnable(1000).run();
		
		out.runnable.run();
	}

}
