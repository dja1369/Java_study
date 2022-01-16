package arrayQuiz;

public class ArrayLength {

	public static void main(String[] args) {
		
		int sum = 0;
		int[] num = new int[5];
		num[0] = 2;
		num[1] = 4;
		num[2] = 6;
		num[3] = 8;
		num[4] = 10;
		for(int i=0; i<num.length; i++) {
		sum += num[i];
		}
		System.out.println(sum);	
	}
}
