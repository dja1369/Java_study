package exception;

public class AutoClosableTest {

	public static void main(String[] args) {
		//Java 7 try-with-resources 구문 에서는 close() 명시적 으로 호출 하지 않아도 모든 리소스가 정확히 해제
		AutoCloseObject obj3 = new AutoCloseObject();
		//Java 9 부터는 try문의 괄호 외부에 리소스를 생성해서 사용 가능 : 가독성도 좋고 , 반복선언 줄어 들어서 좋음 
		try (/*
				 * AutoCloseObject obj1 = new AutoCloseObject(); AutoCloseObject obj2 = new
				 * AutoCloseObject();
				 */
				obj3;){
			System.out.println("리소스가 하나 생성");
			/*
			 * System.out.println("리소스가 하나 더 생성"); System.out.println("리소스가 두개 더 생성");
			 */			//비 정상 종료 되는 경우를 확인하기 위한 , 강제로 예외를 발생 
			throw new Exception("내가 만든 강제 예외");
		}catch(Exception e) {
			System.out.println("Exception Handling");
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}

}
