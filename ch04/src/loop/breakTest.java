package loop;

public class breakTest {

	public static void main(String[] args) {

		int num;
		var sum = 0;

		for (num = 1;; num++) {
			sum += num;
			if (num > 100)
				break; // �ݺ��� ���� ������ �߰��Ͽ� ����. 
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
