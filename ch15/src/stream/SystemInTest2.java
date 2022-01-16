package stream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 한 문자를 입력하고 엔터키를 누르세요");
		
		try {
			int i = System.in.read(); //한 바이트 를 읽어 정수로 반환.
			System.out.println((char)i); //문자열 로 형변환 하여 출력.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
