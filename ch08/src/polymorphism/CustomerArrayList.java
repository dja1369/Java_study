package polymorphism;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		//객체 배열에 상위 클래스 타입에 저장될 인스턴스 추가
		customerList.add(new Customer(10100, "채송화"));
		customerList.add(new Customer(10200, "이익순"));
		customerList.add(new BronzeCustomer(10510, "브론즈"));
		customerList.add(new BronzeCustomer(10510, "실론즈"));		
		customerList.add(new GoldCustomer(20100, "김준완"));
		customerList.add(new GoldCustomer(20200, "최정훈"));
		customerList.add(new VIPCustomer(30100, "김광현",123456));
		
		System.out.println("============고객정보 출력==============");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("============지불 금액과 포인트==============");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(10000);
			System.out.println(customer.getCustomerName()+ " 고객님이 지불 하실 금액은");
			System.out.println(customer.calcPrice(price));
			System.out.println("보너스 포인트는 " + customer.bonusPoint + " 점 입니다.");
		}
			
		
	}

}
