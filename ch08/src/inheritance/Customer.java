package inheritance;

public class Customer { //extends object

	// 상속 관계에서 접근 제어자를 protected로 설정할 경우 , 다른 클래스 에서 이 멤버 변수에 대해 접근 가능.
	protected int customerId;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	protected double bonusRatio;

	public Customer() {
		//super();
		customerGrade = "SILVER"; // 기본 실버 등급
		bonusRatio = 0.01; // 보너스 적립율은 1%
		System.out.println("Customer() 생성자 호출");
	}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER"; // 기본 실버 등급
		bonusRatio = 0.01; // 보너스 적립율은 1%
		System.out.println("Customer() 생성자 호출");
	}

	public int calcPrice(int price) {

		bonusPoint += (price * bonusRatio); // 보너스 적립
		return price; // 지불 가격
	}

	public String showCustomerInfo() { // 고객 정보 출력
		return customerName + " 고객님 의 등급은 " + customerGrade + " 이며, 보너스 포인트는" + bonusPoint + " 점 입니다.";
	}

	// get() , set() 메소드 생성.
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}
