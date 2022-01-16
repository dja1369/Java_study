package exception;

public class Account {
	private int haveCash;
	
	public Account(int haveCash) {
		this.haveCash = haveCash;
	}

	public void setOutputCash(int outputCash) throws AccountException {
		if (haveCash < outputCash) {
			throw new AccountException("�ܾ��� �����մϴ� ");
		}
		this.haveCash -= outputCash;
		}

	public void setInputCash(int inputCash) throws AccountException {
		if (inputCash <= 0) {
			throw new AccountException("0���� �Ա��Ҽ� �����ϴ�");
		}
		this.haveCash += inputCash;
	}

	@Override
	public String toString() {
		return "Account [���� ���� �ڻ��� =" + haveCash + " �� �Դϴ�.]";
	}

	
}
