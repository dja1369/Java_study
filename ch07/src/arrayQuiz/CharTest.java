package arrayQuiz;

public class CharTest {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		//���� �ʱ�ȭ ���� ����
		char ch = 'a'; //65

		for(int i=0; i<alphabets.length; i++) {
			
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + ",,,"+ (int)alphabets[i]);
		}
	}
}
