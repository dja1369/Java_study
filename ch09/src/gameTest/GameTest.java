package gameTest;

public class GameTest {

	public static void main(String[] args) {
		Player player1 = new Player();
		
		player1.play(2);
		player1.upgradeLevel(new AdvanceLevel());
		player1.play(3);
		player1.upgradeLevel(new SuperLevel());
		player1.play(3);
	}

}
