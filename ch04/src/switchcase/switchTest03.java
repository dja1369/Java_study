package switchcase;

public class switchTest03 {

	public static void main(String[] args) {
		var month = 13;
		var day = 1;
		
		switch(month) {
		case 1 : case 3 : case 5: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			System.out.println("���� �� �Դϴ�.");
			return; // ����
		}
		System.out.println(month+"�� �� ������ ����"+ day +"���Դϴ�.");
	}

}