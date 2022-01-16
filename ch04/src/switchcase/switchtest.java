package switchcase;

public class switchtest {

	public static void main(String[] args) {
		var rank = 1;
		char medalColor;
		switch (rank) {
		case 1:
			medalColor = 'G';			
			break;
		case 2:
			medalColor = 'S';			
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'N';
		}
		System.out.println(medalColor);

		// if~else if 구문으로 변경하여 출력
		rank = 3;
		if (rank == 1) {
			medalColor = 'G';
			System.out.println(medalColor);
		}
		else if (rank == 2) {
			medalColor = 'S';
			System.out.println(medalColor);
		}
		else if (rank == 3) {
			medalColor= 'B';
			System.out.println(medalColor);
		}
		else {
			medalColor = 'N';
			System.out.println(medalColor);
		}
	}

}
