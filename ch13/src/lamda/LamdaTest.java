package lamda;

//함수형 인터페이스
@FunctionalInterface
interface PrintString{
	public void showString(String str);
}

public class LamdaTest {

	public static void main(String[] args) {
		//함수를 변수처럼 사용하는 람다식 3가지의 경우
		PrintString lamdaStr = str -> System.out.println(str);
		lamdaStr.showString("기모찌맨" + " 인터페이스 형 변수에 람다식 대입.");
		
		//매개변수의 타입이 인터페이스 타입(메소드의 매개변수로 구현된 람다식에 대입되어 변수에 전달)
		showMyString(lamdaStr); //정적 메소드 호출
		
		//반환값이 인터페이스 타입의 변수에 대입 가능
		PrintString rtnStr = returnString();
		rtnStr.showString("아마리맨" );
	}
	static void showMyString(PrintString pStr) { //전달되는 매개 변수가 인터페이스 타입.
		pStr.showString("와루이맨" + " 매개변수로 전달하는 람다식");
	}
	public static PrintString returnString() {
		//리턴 값을 문자열을 결합하여 반환하도록 메소드 를 구현
		return str -> System.out.println(str + " 반환값으로 사용되는 람다식");
	}
}
