package loop;

import java.io.IOException;

public class learnMoonQ1 {

	public static void main(String[] args) throws IOException {
		var num1 = 10;
		var num2 = 2;
		System.out.println("������ �Է�: ");
//		char operator = '*'; 
		//Ű����� ���� 1���� ���� �Է¹޾� ���� Ÿ������ ����ȯ �Ͽ� ���� operator�� ����
		int operator = (char)(System.in.read()); //IOException ó�� �ʼ�

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
