package scheduler;

public class PriorityAllocation implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� �� ��� ���� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� ���� ���� �켱�� ���� ���� �մϴ�");
	}

}
