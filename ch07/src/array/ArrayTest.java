package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] studentId1 = new int[] { 1001, 1002, 1003 };
		int[] studentId2 = { 1001, 1002, 1003 };
		int[] studentId3; // ������ �迭 ���� ����.
		studentId3 = new int[] { 1001, 1002, 1003 };

		System.out.println(studentId3[1]);

		for (int i = 0; i < 3; i++) {
			System.out.println(studentId3[i]);
		}
		/*
		 * double[] arrays = new double[3];
		 * 
		 * 
		 * //�ʱ�ȭ ���� ���� �迭�� ��Ұ� ������ ��� 0�� �ʱⰪ���� ���� //�ʱ�ȭ ���� ���� �迭�� ��Ұ� �Ǽ��� ��� 0.0�� �ʱⰪ����
		 * ���� for(int i =0; i<3; i++) { System.out.println(arrays[i]); }
		 */
	}
}
