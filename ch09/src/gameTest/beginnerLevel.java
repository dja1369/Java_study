package gameTest;

public class beginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("달려요");
	}

	@Override
	public void jump() {
		System.out.println("못 뛰어요");
	}

	@Override
	public void turn() {
		System.out.println("못 돌아요");
	}

	@Override
	public void showLevelInfo() {
		System.out.println("초보에요");
	}

}
