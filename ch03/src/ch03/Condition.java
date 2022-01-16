package ch03;

public class Condition {

	public static void main(String[] args) {

		var fatherAge = 45;
		var motherAge = 47;
		
		char ch = (fatherAge > motherAge) ? 'T' :  'F';
		System.out.println(ch);
		
		var num = 10;
		boolean isEven = (num % 2 == 0) ? true : false ;
		System.out.println(isEven);
	}

}
