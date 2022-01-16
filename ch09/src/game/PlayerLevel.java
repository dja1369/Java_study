package game;

public abstract class PlayerLevel {
	// �� �������� �����ϴ� �߻� �޼ҵ�
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) { //�ó������� ������ ���ø� �޼ҵ�
	run();
	for (int i=0; i<count; i++) {
		jump();
	}
	turn();

}
}
