package loop;

public class forTest {

	public static void main(String[] args) {

		var num = 1;
		var sum = 0;
		for (num =1; num<=10; num++) {
			System.out.println(num + " , "+ sum);
			sum += num;
		}
		// System.out.println(sum);
	}

}
