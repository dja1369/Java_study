package gameTest;

public class Player {
	private PlayerLevel level;

	public Player() {
		level = new beginnerLevel();
		level.showLevelInfo();
	}
	
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelInfo();
	}
	public void play(int count) {
		level.go(count);
	}
	
}
