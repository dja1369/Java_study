package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		String[] strArray = { "100", "205", "z1000" };

		int value = 0;

		for (int i = 0; i < strArray.length; i++) {
			try {
				value = Integer.parseInt(strArray[i]); // ������ ����ȯ �Ͽ� ������ ����
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� �����ϴ�");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� �ε��� ��ȣ�� �ʰ�����");
			} catch (Exception e) { // �⺻ ���� ó�� ���
				System.out.println(e);
			}finally {
				System.out.println(value);
			}
		}
	}

}
