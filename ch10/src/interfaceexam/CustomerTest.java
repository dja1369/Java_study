package interfaceexam;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();

		// 재정의한 메소드가 호출
		customer.buy();
		customer.sell();

		Buy buyer = customer; 
		buyer.buy();
		buyer.order(); //대입된 인스턴스의 메소드가 호출

		Sell seller = customer;
		seller.sell();
		seller.order(); //가상 메소드 의 원리 , 재정의 된 메소드가 호출.
		// downcasting 할경우 오류가 발생할수 있으므로 타입 체크 반드시 해야함
		if (seller instanceof Customer) { //[객체] instanceof [클래스 자료형]
			Customer newCustomer = (Customer) seller; // 강제 형변환 (명시적)
			System.out.println("다운 캐스팅 결과 메서드 호출");
			newCustomer.buy();
			newCustomer.sell();
			newCustomer.order();
		} else {
			System.out.println("변환 할수 없는 타입");
		}

	}
}
