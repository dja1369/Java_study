package gameTest;

public class beginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�޷���");
	}

	@Override
	public void jump() {
		System.out.println("�� �پ��");
	}

	@Override
	public void turn() {
		System.out.println("�� ���ƿ�");
	}

	@Override
	public void showLevelInfo() {
		System.out.println("�ʺ�����");
	}

}
