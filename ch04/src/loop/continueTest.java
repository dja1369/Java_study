package loop;

public class continueTest {

	public static void main(String[] args) {
		int num;
		var total = 0;

		for (num = 1; num <= 100; num++) {

			if (num % 2 == 0) {
				continue; //���� ������ �ǳʶٱ�(����)
			}
			total += num;
		}
		System.out.println("1~100 ������ Ȧ���� �� "+total);
	}

}
