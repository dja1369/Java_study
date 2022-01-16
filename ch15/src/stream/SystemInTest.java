package stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 문자를 입력하고 엔터키를 누르세요");
		
		
		try { 
			int i;
			while((i = System.in.read()) != '\n') { // \n 엔터키.

				System.out.print((char)i); //문자열 로 형변환 하여 출력.
			}} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
