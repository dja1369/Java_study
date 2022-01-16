package game;

public class Player {
	private PlayerLevel level;
	
	public Player() {//����Ʈ ������ �߰�
		level = new BeginnerLever(); //�ʱ��ڸ� �����Ͽ� ó�� ������ �����
		level.showLevelMessage(); 	//���� Ȯ�� �޼��� ȣ��
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;		//�Ű������� ���޹��� ������ ����
		level.showLevelMessage(); //���� Ȯ�� �޼��� ȣ��
		}
	public void play(int count) {
		level.go(count); //�� ���� �� ���ø� �޼ҵ� ȣ��. 
	}
	
}
