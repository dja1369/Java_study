package gameTest;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���� �پ��");
	}

	@Override
	public void jump() {
		System.out.println("���� �����ؿ�");
	}

	@Override
	public void turn() {
		System.out.println("�� �ؿ�");
	}
	@Override
	public void showLevelInfo() {
		System.out.println("��� ����");		
	}

}
