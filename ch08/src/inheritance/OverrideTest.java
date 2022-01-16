package inheritance;

public class OverrideTest {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2345);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.showCustomerInfo()); // 어떤클래스의 정보가 호출되나?
		
		int cost = vc.calcPrice(10000);
		System.out.println(vc.getCustomerName()+ " 고객 님의 지불 금액은 " + cost + " 이고 보너스 포인트 는 "
		+ vc.getBonusPoint()+ " 점 입니다.");
	}

}
