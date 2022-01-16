package array;

public class TwodimensionArray {

	public static void main(String[] args) {
		//2차원 배열의 선언과 초기화
		int[][] array= new int[][] {{1,2,3} , {4,5,6}};
									
	
		//2차원 배열의 크기
		System.out.println(array.length);
		
		//한 행당 요소의 개수
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
		System.out.println();
	}
	//배열의 요소를 향상된for 문으로 출력 enhancedfor.
		for(int[] i:array) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println(' ');
		}
		String[][] alphabets = {{"a","b","c","d","e","f","g","h","i","j","k","l","n"},
				{"m","o","p","q","r","s","t","u","v","w","x","y","z"}};
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j]+ " - - ");
			}
			System.out.println();
		}
		for(String[] i:alphabets) {
			for(String j:i) {
				System.out.print(j);
			}
			System.out.println(' ');
		}
		
		char[][] easyalpha = new char[13][2];
		char ch= 'a';
		for(int i=0; i<easyalpha.length; i++) {
			for(int j=0; j<easyalpha[i].length; j++) {
				easyalpha[i][j] = ch++;
				System.out.print(easyalpha[i][j]);
			}
		}
				
		
}}
