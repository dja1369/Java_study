package ifexample;

public class CashCheaker {

	public static void main(String[] args) {

		var age = 20;
		int charge =0 ; 
		if ( age < 8) {
			charge = 1000;
			System.out.println("�����" + charge + "�Դϴ�");
		}
		else if ( age < 14) {
			charge = 2000;
			System.out.println("�����" + charge + "�Դϴ�");
		}
		else if ( age < 20) {
			charge = 3000;
			System.out.println("�����" + charge + "�Դϴ�");
		}
		else if ( age >= 60) {
			System.out.println("��ο�� �����Դϴ�");
		}
		else {
			charge = 5000;
			System.out.println("�����" + charge + "�Դϴ�");
		}

}
}