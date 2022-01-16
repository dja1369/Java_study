package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void main(String[] args) {
		ThrowsException exp = new ThrowsException();

		try {
			int num = 1 / 0; // 실행 오류 발생
			exp.loadClass("b.txt", "exception.AutoCloseObject");
			// 강제 예외를 발생시킴.
			throw new Exception("또 다른 강제 예외를 발생시킴");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누어 예외 발생 " + e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} // 미뤄진 예외를 처리 해야함.
		catch (Exception e) { // 최상위 예외 클래스의 Exception 블록은 항상 마지막에 배치해야 모든 예외가 처리될수 있음.
			System.out.println("발생된 강제 예외를 처리합니다.");
		}
		System.out.println("ENDD");
	}// 예외 처리를 미룬 후 , 메소드 호출에서 사용하는 부분에서 예외를 처리 하도록 함.

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능성 있음
		Class returnClass = Class.forName(className);// ClassNotFoundException 발생 가능성 있음
		return returnClass;
	}
}
