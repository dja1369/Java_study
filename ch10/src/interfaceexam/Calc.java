package interfaceexam;

public interface Calc {
	double PI = 3.14; //public static final �� ���� �Ǿ�����
	int ERROR = -99999999;
	
	default void describe() { //default : ���� ������ ����
		method(); // private �޼ҵ� ȣ��
		System.out.println("���� ���⸦ ���� �߽��ϴ�.");
	}
	
	static int total(int[] array) { //���� �żҵ� : �ν��Ͻ��� ������ ������
		staticMethod(); // private ���� �޼ҵ� ȣ��
		int total =0;
		//�迭 ����� �հ踦 ���ϴ� ���� for ��
		for (int i : array) {
			total += i;
		}
		return total;
	}
	private void method() { //private �޼ҵ� : �������̽� ���� ������ ��밡��
		System.out.println("Calc private void method()");
	}
	
	private static void staticMethod() {//private ���� �޼ҵ� : �������̽� ���� ������ ��밡���� ���� �޼ҵ�
		System.out.println("private static void staticMethod()");
	}
	
	int add(int num1 , int num2); // ���� �� �Ǿ� ���� (�߻� �żҵ�)
	int subtract(int num1 , int num2);
	int multiply(int num1, int num2);
	int divide(int num1, int num2);
	int mod(int num1 , int num2);
	int square(int num1);

}
