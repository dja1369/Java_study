package ch002;

public class Character {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		
		ch1 = 'B';
		System.out.println(ch1);
		
		char ch2 = 65;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int i = 66;
		System.out.println(i);
		System.out.println((char)i);
		
		// 소문자 'a'의 아스키 코드 값은
		System.out.println((int)'a');
		// 대문자 'Z'의 아스키 코드 값은
		ch2 = 'Z';
		System.out.println((int)ch2);
		// 아스키코드 값 38에 해당되는 문자는
		i = 38;
		System.out.println((char)i);
		
		//char type : 음수값은 대입 불가능
//		ch2 = -65; // type mismatch OoO
		i = -65;
		
		char ch3 ='한';
		System.out.println(ch3);
		
		char ch4 = '\uD55C';
		System.out.println(ch4);
		
		char ch5 = '\uAD6D';
		System.out.println(ch5);
		
	}

}
