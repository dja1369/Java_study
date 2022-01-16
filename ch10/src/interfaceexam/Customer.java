package interfaceexam;

public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("sell()");
	}

	@Override
	public void buy() {
		System.out.println("buy()");
	}

	@Override
	public void order() { //중복된 디폴트 매소드는 인터페이스를 구현한 클래스 에서 반드시 재정의 해야 한다.
		System.out.println("Customer order()");
	}

}
