package polymorphism;

public class BronzeCustomer extends Customer{
	private double salesRatio;

	public BronzeCustomer(int customerId , String customerName ) {
		super(customerId,customerName); //부모의 매개변수 생성자를 호출
		customerGrade = "Bronze"; //기본 VIP 등급
		bonusRatio = 0.03;	//보너스 적립율은 1%
		salesRatio = 0.05;
		System.out.println("BronzeCustomer(int customerId , String customerName) 생성자 호출");
	}
	
	
	@Override
	public int calcPrice(int price) {
		//매소드 오버 라이딩 : 부모의 매서드와 리턴타입이 일치 하어야 하고 
 		//매소드 이름 , 매개변수의 타입 , 매개변수 의 개수도 모두 일치하는 메소드를 수정한것(재정의)
 		bonusPoint += (price * bonusRatio);		  //보너스 포인트 적립.
 		return price = price - (int)(price * salesRatio); //할인 금액 반환.
	
	}


	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	
}
