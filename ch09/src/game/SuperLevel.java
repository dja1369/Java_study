package game;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
System.out.println("엄청 빨리 달립니다.");		
	}

	@Override
	public void jump() {
System.out.println("높이 점프할수 있습니다.");		
	}

	@Override
	public void turn() {
System.out.println("턴 할수 있습니다.");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("********************썩은물 입니다********************");
	}

}
