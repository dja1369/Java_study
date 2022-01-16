package loop;

public class continueQuiz01 {

	public static void main(String[] args) {

		int num;
		int total = 0;
		
		for (num = 1; num <= 100; num++) {
			if(num % 3 ==0) {
				total += num;
			}
			else {
				continue;
			}
		}
		System.out.println(total);
		
	}

}
