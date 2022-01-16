package game;

public class BeginnerLever extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 할수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("점프 할수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("********************뉴비 입니다********************");
	}

}
