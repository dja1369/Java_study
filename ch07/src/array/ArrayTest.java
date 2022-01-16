package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] studentId1 = new int[] { 1001, 1002, 1003 };
		int[] studentId2 = { 1001, 1002, 1003 };
		int[] studentId3; // 정수형 배열 변수 선언.
		studentId3 = new int[] { 1001, 1002, 1003 };

		System.out.println(studentId3[1]);

		for (int i = 0; i < 3; i++) {
			System.out.println(studentId3[i]);
		}
		/*
		 * double[] arrays = new double[3];
		 * 
		 * 
		 * //초기화 되지 않은 배열의 요소가 정수인 경우 0이 초기값으로 설정 //초기화 되지 않은 배열의 요소가 실수인 경우 0.0이 초기값으로
		 * 설정 for(int i =0; i<3; i++) { System.out.println(arrays[i]); }
		 */
	}
}
