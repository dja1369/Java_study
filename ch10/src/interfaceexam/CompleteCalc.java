package interfaceexam;

public class CompleteCalc extends Calculator {

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 == 0)
			return Calc.ERROR; // �������̽��� ���� ������� ��ȯ
		else
			return num1 / num2;
	}

	public int mod(int num1, int num2) {
		return num1 % num2;
	}
	public int square(int num1) {
		return num1 * num1;
	}
	//�߰� ��� : ��� ���� ���� �� Ŭ���� ���� ���� ������ �ż���
	public void showInfo() {
		System.out.println("Calc �������̽��� ������ Ŭ���� �Դϴ�.");
	}

	@Override
	public void describe() {
		System.out.println("�Ϻ��� ���� ���⸦ ���� �߽��ϴ�...");
	}
	
	
}