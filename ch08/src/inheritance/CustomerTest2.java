package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customer = new Customer(1001, "홍길동");
		VIPCustomer vip = new VIPCustomer(2001, "최정훈" ,10000);
		Customer customer2 = vip;  //묵시적 클래스 형 변환 (UpCasting : 업 캐스팅)

		System.out.println(customer.showCustomerInfo());
		System.out.println(vip.showCustomerInfo());
	}

}
