package gameTest;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 뛰어요");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프해요");
	}

	@Override
	public void turn() {
		System.out.println("턴 해요");
	}
	@Override
	public void showLevelInfo() {
		System.out.println("고수 에용");		
	}

}
