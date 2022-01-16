package scheduler;

public class LeastJob implements Schedular {

	@Override
	public void getNextCall() {
	System.out.println("상담 전화를 순서대로 대기열로 부터 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 끝났거나 대기가 가장 적은 상담원 에게 할당 합니다.");
	}

}
