package game;

public class GameTest {

	public static void main(String[] args) {
		Player player1 = new Player();
		
		player1.play(4);
		Player player2 = new Player();
		player2.upgradeLevel(new AdvanceLevel());
		player2.play(4);
		Player player3 = new Player();
		player3.upgradeLevel(new SuperLevel());
		player3.play(4);
	}

}
