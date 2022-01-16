package ch03;

public class Operater_Logical {

	public static void main(String[] args) {

		int num1 , num2 ;
		num1 = 10;
		num2 = 20;
		
		boolean value = (num1 > 0) && (num2 > 0); // AND
		System.out.println(value);
		
		value = (num1 < 0) && (num2 < 0);
		System.out.println(value);
		
		value = (num1 < 0) || (num2 > 0); // OR
		System.out.println(value);

		
		}	
	}
