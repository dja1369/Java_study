package loop;

import java.io.IOException;

public class learnMoonQ1 {

	public static void main(String[] args) throws IOException {
		var num1 = 10;
		var num2 = 2;
		System.out.println("연산자 입력: ");
//		char operator = '*'; 
		//키보드로 부터 1개의 값을 입력받아 문자 타입으로 형변환 하여 변수 operator에 대입
		int operator = (char)(System.in.read()); //IOException 처리 필수

		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/'){
			System.out.println(num1 / num2);
		}
		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		default:
			System.out.println(num1 / num2);
		}

	}

}
