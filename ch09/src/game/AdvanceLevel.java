package game;

public class AdvanceLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 합니다");
	}

	@Override
	public void turn() {
		System.out.println("턴 할수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("********************평균 입니다********************");
	}

}
