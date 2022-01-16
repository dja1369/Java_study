package ch03;

public class SceTest {

	public static void main(String[] args) {

		var num1 = 10;
		var i = 2;
		
		boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 += 10) > 10) || ((i += 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
