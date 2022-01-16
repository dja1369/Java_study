package innerclass;

import java.util.ArrayList;


class OutClass { // 외부 클래스
	private int outNum = 100; // 인스턴스 변수
	private static int sNum = 200; // 정적 변수
	// private ArrayList<String> sList;

	/* private */ InClass inClass; // 내부 클래스(타입) 변수 선언;

	// 외부 클래스의 생성자
	public OutClass() { // 외부 클래스가 생성된 이후에 내부 클래스를 생성 할수 있음.
		// sList = new ArrayList<String>();
		inClass = new InClass(); // 내부 클래스 생성
	}

	/* private */ class InClass { // 실질적인 내부 클래스
		int inNum = 10; // 인스턴스 변수.
		// static int sInNum = 20; // 내부 정적 변수 는 사용 불가 함

		void inTest() {
			System.out.println("OutClass outNum : " + outNum); // 외부 클래스 의 인스턴스 변수
			System.out.println("OutClass sNum : " + sNum); // 외부 클래스의 정적 변수

		}

		/*
		 * static void sTest() { //정적 메소드 , 인스턴스의 생성과 무관하게 호출 가능
		 * 
		 * System.out.println("OutClass iNum : " + outNum); //외부 클래스의 인스턴스 변수
		 * System.out.println("OutClass sNum : " + sNum); // 외부 클래스의 정적 변수
		 * 
		 * }
		 */

	}

	static class staticInClass { // 정적 내부 클래스.
		int iNum = 1; // 인스턴스 변수.
		static int siNum = 2; // 정적 변수

		void inTest() {
			// System.out.println("OutClass outNum : " + outNum); // 외부 클래스 의 인스턴스 변수 , 오류
			System.out.println("OutClass sNum : " + sNum); // 외부 클래스의 정적 변수
			System.out.println("staticInClass siNum : " + siNum);
		}

		static void sTest() { // 정적 메소드, 인스턴스의 생성과 무관하게 호출 가능. -> static 변수만 사용가능
			System.out.println("OutClass sNum : " + sNum); // 외부 클래스의 정적 변수
			System.out.println("staticInClass siNum : " + siNum);
		}
	}

	public void usingTest() {// 외부 클래스 의 일반 메소드
		inClass.inTest(); // 내부 클래스의 메소드를 호출
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass.staticInClass.sTest();   //즉시 정적 내부 클래스의 정적 메소드 호출 
		
		System.out.println();
		//외부 클래스의 생성과 무관하게(생성하지 않고도 ) , 내부 클래스 자료형으로 바로 선언해 내부 클래스를 생성 가능
		OutClass.staticInClass sInClass = new OutClass.staticInClass();
		sInClass.inTest(); //일반 메소드 호출
		/*
		 * OutClass outClass = new OutClass(); // outClass.InClass;
		 * outClass.usingTest(); //내부 클래스의 일반 메소드를 메소드 호출시 , 부르면 그 결과 값을 출력
		 * 
		 * System.out.println("먼저 외부 클래스 를 만들고 , 생성한 참조 변수를 사용해 클래스를 생성.");
		 * OutClass.InClass inClass = outClass.new InClass(); inClass.inTest();
		 */
	}

}
