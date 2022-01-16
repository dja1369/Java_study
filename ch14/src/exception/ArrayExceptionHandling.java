package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] array = new int[5];
		try {
			for (int i = 0; i <= array.length; i++) {
				array[i] = i + 1; // �迭 ��� �ʱ�ȭ
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // �߻��� ���ܸ� ó���ϴ� ���
			System.out.println(e/* .toString() */);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("���ܰ� �߻��ϵ� �ʵ� �׻� ����Ǵ� ���");
		}
		System.out.println(" END "); //������� �����ϸ� ���� ����.
	}

}
