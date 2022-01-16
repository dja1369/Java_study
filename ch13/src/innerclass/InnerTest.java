package innerclass;

import java.util.ArrayList;


class OutClass { // �ܺ� Ŭ����
	private int outNum = 100; // �ν��Ͻ� ����
	private static int sNum = 200; // ���� ����
	// private ArrayList<String> sList;

	/* private */ InClass inClass; // ���� Ŭ����(Ÿ��) ���� ����;

	// �ܺ� Ŭ������ ������
	public OutClass() { // �ܺ� Ŭ������ ������ ���Ŀ� ���� Ŭ������ ���� �Ҽ� ����.
		// sList = new ArrayList<String>();
		inClass = new InClass(); // ���� Ŭ���� ����
	}

	/* private */ class InClass { // �������� ���� Ŭ����
		int inNum = 10; // �ν��Ͻ� ����.
		// static int sInNum = 20; // ���� ���� ���� �� ��� �Ұ� ��

		void inTest() {
			System.out.println("OutClass outNum : " + outNum); // �ܺ� Ŭ���� �� �ν��Ͻ� ����
			System.out.println("OutClass sNum : " + sNum); // �ܺ� Ŭ������ ���� ����

		}

		/*
		 * static void sTest() { //���� �޼ҵ� , �ν��Ͻ��� ������ �����ϰ� ȣ�� ����
		 * 
		 * System.out.println("OutClass iNum : " + outNum); //�ܺ� Ŭ������ �ν��Ͻ� ����
		 * System.out.println("OutClass sNum : " + sNum); // �ܺ� Ŭ������ ���� ����
		 * 
		 * }
		 */

	}

	static class staticInClass { // ���� ���� Ŭ����.
		int iNum = 1; // �ν��Ͻ� ����.
		static int siNum = 2; // ���� ����

		void inTest() {
			// System.out.println("OutClass outNum : " + outNum); // �ܺ� Ŭ���� �� �ν��Ͻ� ���� , ����
			System.out.println("OutClass sNum : " + sNum); // �ܺ� Ŭ������ ���� ����
			System.out.println("staticInClass siNum : " + siNum);
		}

		static void sTest() { // ���� �޼ҵ�, �ν��Ͻ��� ������ �����ϰ� ȣ�� ����. -> static ������ ��밡��
			System.out.println("OutClass sNum : " + sNum); // �ܺ� Ŭ������ ���� ����
			System.out.println("staticInClass siNum : " + siNum);
		}
	}

	public void usingTest() {// �ܺ� Ŭ���� �� �Ϲ� �޼ҵ�
		inClass.inTest(); // ���� Ŭ������ �޼ҵ带 ȣ��
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass.staticInClass.sTest();   //��� ���� ���� Ŭ������ ���� �޼ҵ� ȣ�� 
		
		System.out.println();
		//�ܺ� Ŭ������ ������ �����ϰ�(�������� �ʰ� ) , ���� Ŭ���� �ڷ������� �ٷ� ������ ���� Ŭ������ ���� ����
		OutClass.staticInClass sInClass = new OutClass.staticInClass();
		sInClass.inTest(); //�Ϲ� �޼ҵ� ȣ��
		/*
		 * OutClass outClass = new OutClass(); // outClass.InClass;
		 * outClass.usingTest(); //���� Ŭ������ �Ϲ� �޼ҵ带 �޼ҵ� ȣ��� , �θ��� �� ��� ���� ���
		 * 
		 * System.out.println("���� �ܺ� Ŭ���� �� ����� , ������ ���� ������ ����� Ŭ������ ����.");
		 * OutClass.InClass inClass = outClass.new InClass(); inClass.inTest();
		 */
	}

}
