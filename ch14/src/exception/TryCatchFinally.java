package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		String[] strArray = { "100", "205", "z1000" };

		int value = 0;

		for (int i = 0; i < strArray.length; i++) {
			try {
				value = Integer.parseInt(strArray[i]); // 정수로 형변환 하여 변수에 대입
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없습니다");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범호를 초과했음");
			} catch (Exception e) { // 기본 예외 처리 블록
				System.out.println(e);
			}finally {
				System.out.println(value);
			}
		}
	}

}
