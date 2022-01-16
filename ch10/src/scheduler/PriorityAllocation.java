package scheduler;

public class PriorityAllocation implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객 상담 콜을 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 숙련도가 높은 상담원 에게 우선적 으로 배정 합니다");
	}

}
