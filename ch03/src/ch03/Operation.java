package ch03;

public class Operation {

	public static void main(String[] args) {

		var matScore = 90;
		var engScore = 70;
		var korScore = 80;
		
		
		var totalScore = matScore + engScore + korScore;
		
		System.out.println("�� ������"+totalScore+"��");
		
		var avgScore = totalScore / 3.0;
		System.out.println("���������"+avgScore+"��");
		
		var gameScore = 150;
		
		var lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		var lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		var avgGameScore = lastScore1 + lastScore2;
		System.out.println(avgGameScore);
		
		var value = (gameScore == 150); //boolean
		System.out.println(value);

		value = (gameScore != 150);
		System.out.println(value);
}
}