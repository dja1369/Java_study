package loop;

public class continueTest {

	public static void main(String[] args) {
		int num;
		var total = 0;

		for (num = 1; num <= 100; num++) {

			if (num % 2 == 0) {
				continue; //조건 충족시 건너뛰기(제외)
			}
			total += num;
		}
		System.out.println("1~100 까지의 홀수의 합 "+total);
	}

}
