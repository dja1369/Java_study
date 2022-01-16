package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void main(String[] args) {
		ThrowsException exp = new ThrowsException();

		try {
			int num = 1 / 0; // ���� ���� �߻�
			exp.loadClass("b.txt", "exception.AutoCloseObject");
			// ���� ���ܸ� �߻���Ŵ.
			throw new Exception("�� �ٸ� ���� ���ܸ� �߻���Ŵ");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ���� �߻� " + e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} // �̷��� ���ܸ� ó�� �ؾ���.
		catch (Exception e) { // �ֻ��� ���� Ŭ������ Exception ����� �׻� �������� ��ġ�ؾ� ��� ���ܰ� ó���ɼ� ����.
			System.out.println("�߻��� ���� ���ܸ� ó���մϴ�.");
		}
		System.out.println("ENDD");
	}// ���� ó���� �̷� �� , �޼ҵ� ȣ�⿡�� ����ϴ� �κп��� ���ܸ� ó�� �ϵ��� ��.

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException �߻� ���ɼ� ����
		Class returnClass = Class.forName(className);// ClassNotFoundException �߻� ���ɼ� ����
		return returnClass;
	}
}
