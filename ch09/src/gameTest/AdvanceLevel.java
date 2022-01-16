package gameTest;

public class AdvanceLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 뛰어요");
	}

	@Override
	public void jump() {
		System.out.println("점프 해요");
	}

	@Override
	public void turn() {
		System.out.println("못 돌아요");
	}

	@Override
	public void showLevelInfo() {
		System.out.println("중급자 에용");
	}

}
