package switchcase;

public class switchtest02 {

	public static void main(String[] args) {
		var medal = "Silver";
		
		switch (medal) {
		case "Gold":
			System.out.println("�ݸ޴�");
			break;
		case "Silver":
			System.out.println("���޴�");
			break;
		case "Bronze":
			System.out.println("���޴�");
			break;
		default:
			System.out.println("�޴ޱ��� �ƴմϴ�");
		}
		
	}

}
