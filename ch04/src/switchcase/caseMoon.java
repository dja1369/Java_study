package switchcase;

public class caseMoon {

	public static void main(String[] args) {

		var tower = 5;
		switch (tower) {
		case 1:
			System.out.println("1층은 약국입니다.");
			break;
		case 2:
			System.out.println("2층은 정형외과입니다.");
			break;
		case 3:
			System.out.println("3층은 피부과입니다.");
			break;
		case 4:
			System.out.println("4층은 치과입니다.");
			break;
		default:
			System.out.println("5층은 헬스 클럽 입니다.");
		}
		
	}

}
