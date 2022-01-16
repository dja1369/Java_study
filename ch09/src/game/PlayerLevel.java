package game;

public abstract class PlayerLevel {
	// 각 레벨별로 구현하는 추상 메소드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) { //시나리오로 정의한 템플릿 메소드
	run();
	for (int i=0; i<count; i++) {
		jump();
	}
	turn();

}
}
