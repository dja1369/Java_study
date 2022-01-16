package inheritance;

public class VIPCustomer extends Customer{
	private double salesRatio; //할인율
 	private int agentId; // 전문 상담원
	
	
	public VIPCustomer() {
		//super() , Customer() 컴파일러 가 자동으로 디폴트 생성자로 부모의 생성자를 호출
		customerGrade = "VIP"; //기본 VIP 등급
		bonusRatio = 0.05;	//보너스 적립율은 1%
		//System.out.println("VIPCustomer() 생성자 호출");
	}
 	
 	//아이디와 이름을 매개변수로 갖는 생성자
 	public VIPCustomer(int customerId , String customerName , int agentId) {
		super(customerId,customerName); //부모의 매개변수 생성자를 호출
		this.agentId=agentId;
		customerGrade = "VIP"; //기본 VIP 등급
		bonusRatio = 0.05;	//보너스 적립율은 1%
		System.out.println("VIPCustomer(int customerId , String customerName) 생성자 호출");
	}
	
 	@Override
	public int calcPrice(int price) {
 		//매소드 오버 라이딩 : 부모의 매서드와 리턴타입이 일치 하어야 하고 
 		//매소드 이름 , 매개변수의 타입 , 매개변수 의 개수도 모두 일치하는 메소드를 수정한것(재정의)
 		bonusPoint += (price * bonusRatio);		  //보너스 포인트 적립.
 		return price = (int)(price * salesRatio); //할인 금액 반환.
	}

	public String showCustomerInfo() { // 고객 정보 를 변환 , 메소드를 재정의 하는것을 (overriding : 오버라이딩) 이라 한다.
		/*return super.getCustomerName()+ " 고객님 의 등급은 " + customerGrade + " 이며, 보너스 포인트는" + bonusPoint + " 점 입니다."
	+ "전문 상담원 의 아이디는 " + agentId + " 입니다. ";*/
 		return super.showCustomerInfo()+ "전문 상담원 의 아이디 는 " + agentId + " 입니다!";
	}

	public int getAgentId() {
		return agentId;
	}

	
}
