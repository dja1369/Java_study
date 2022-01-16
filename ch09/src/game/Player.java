package game;

public class Player {
	private PlayerLevel level;
	
	public Player() {//디폴트 생성자 추가
		level = new BeginnerLever(); //초급자를 생성하여 처음 레벨로 만들기
		level.showLevelMessage(); 	//레벨 확인 메세지 호출
	}

	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;		//매개변수로 전달받은 레벨로 변경
		level.showLevelMessage(); //레벨 확인 메세지 호출
		}
	public void play(int count) {
		level.go(count); //각 레별 별 템플릿 메소드 호출. 
	}
	
}
