package ch03;

public class Q1 {

	public static void main(String[] args) {

		var myAge = 23;
		var teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		var ch = (myAge > teacherAge)? 'T' : 'F';
		System.out.println(ch);
	}

}
