package scheduler;

public class RoundRobin implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열로 부터 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원 에게 배분합니다.");
	}

}
