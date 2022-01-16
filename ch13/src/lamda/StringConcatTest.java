package lamda;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Programming";
		
		StringConcat concat = new StringConcatClass(); //인터페이스 타입의 참조변수에 구현한 인스턴스를 대입
		concat.makeString(s1, s2); //구현된 메소드 호출(가상 메소드)
		
		int localNum = 100;
		
		
		//람다식으로 인터페이스를 구현 , 반드시 추상 메소드를 하나만 갖는 함수형 인터페이스 만 가능 
		StringConcat concatLamda = (str1 , str2) -> {
			//localNum = 200;
			//람다식은 내부변수가 두개 이상이 될경우 중괄호 를 넣어야함 또는 return이 존재할떄도 중괄호를 넣어야함
			System.out.println(localNum); //참조는 가능함 변경은 불가능 Why? final 상수 이기 때문.
			System.out.println(str1 + " " + str2);
		};
		
		concatLamda.makeString(s1, s2);

		//익명 객체를 생성하는 람다식: 인터페이스 형의 변수에 메소드의 구현부를 직접대입.
		StringConcat concatAnonymous = new StringConcat() {
			
			@Override
			public void makeString(String str1, String str2) {
				System.out.println(str1 + " " + str2);
			}
		};
		
	}

}
