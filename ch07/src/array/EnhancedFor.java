package array;

public class EnhancedFor {
	public static void main(String[] args) {
		
		String[] strArray = {"C","Python","Java","Android","JavaScript"};
		
		for (int i =0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println();
		
		//For(�ڷ��� ��� �Ѱ��� ���� ���� : �迭)
		for(String str: strArray) {
			System.out.println(str);
		}
	}
}
