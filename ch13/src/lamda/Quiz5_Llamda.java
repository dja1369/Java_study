package lamda;

@FunctionalInterface
interface calc {
	int add(int num1 , int num2);
}

public class Quiz5_Llamda {
	public static void main(String[] args) {
	calc Num = (a , b) -> a+b;
	int addNum = Num.add(10,20);
	
	System.out.println(addNum);
}}
