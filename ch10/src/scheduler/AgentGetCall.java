package scheduler;

public class AgentGetCall implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("������ ���� ��ȭ ��û.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ ��ȭ ����� ���� �����ϴ�.");
	}

}
