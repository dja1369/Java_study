package loop;

public class breakTest {

	public static void main(String[] args) {

		int num;
		var sum = 0;

		for (num = 1;; num++) {
			sum += num;
			if (num > 100)
				break; // 반복문 내에 조건을 추가하여 종료. 
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
