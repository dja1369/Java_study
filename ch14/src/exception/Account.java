package exception;

public class Account {
	private int haveCash;
	
	public Account(int haveCash) {
		this.haveCash = haveCash;
	}

	public void setOutputCash(int outputCash) throws AccountException {
		if (haveCash < outputCash) {
			throw new AccountException("잔액이 부족합니다 ");
		}
		this.haveCash -= outputCash;
		}

	public void setInputCash(int inputCash) throws AccountException {
		if (inputCash <= 0) {
			throw new AccountException("0원은 입금할수 없습니다");
		}
		this.haveCash += inputCash;
	}

	@Override
	public String toString() {
		return "Account [현재 보유 자산은 =" + haveCash + " 원 입니다.]";
	}

	
}
