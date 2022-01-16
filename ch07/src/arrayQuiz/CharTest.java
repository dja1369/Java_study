package arrayQuiz;

public class CharTest {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		//문자 초기화 변수 선언
		char ch = 'a'; //65

		for(int i=0; i<alphabets.length; i++) {
			
			alphabets[i] = ch++;
			System.out.println(alphabets[i] + ",,,"+ (int)alphabets[i]);
		}
	}
}
