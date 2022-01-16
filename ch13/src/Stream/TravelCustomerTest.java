package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(new TravelCustomer("이우주", 6, 50));
		customerList.add(new TravelCustomer("이익준", 42, 100));
		customerList.add(new TravelCustomer("장홍도", 29, 100));
		
		/*
		 * for(TravelCustomer customer : customerList) { System.out.println(customer);
		 * //toString() 자동 호출 }
		 */
		//람다식을 이용한 고객 리스트의 정보 출력 
		customerList.stream().forEach(customer -> System.out.println(customer));
		System.out.println(" === 고객 명단에 추가된 오름 차순 고객의 이름 === ");
		//스트림 으로부터 고객의 이름만 가져와 모든 고객의 정보를 출력
		customerList.stream().map(customer -> customer.getName()).sorted().forEach(customer -> System.out.println(customer));
	
		//총 여행 비용 계산 결과 출력
		int totalCost = customerList.stream().mapToInt(customer -> customer.getPrice()).sum();
		System.out.println("여행 총 비용은 " + totalCost + " 만원 입니다.");
	
		System.out.println(" === 20세 이상고객 명단 내림차순 정렬 하여 출력 === ");
		customerList.stream().filter(customer -> customer.getAge() >= 20)
		.map(customer -> customer.getName()).sorted(Comparator.reverseOrder()).forEach(customer -> System.out.println(customer));
	}
	
}
