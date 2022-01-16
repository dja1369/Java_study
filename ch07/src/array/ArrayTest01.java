package array;

public class ArrayTest01 {

	public static void main(String[] args) {
		//정수형 배열 생성과 동시에 초기화
		int sum =0;
		int[] num = new int[] { 0,1,2,3,4,5,6,7,8,9,10};
		//배열 요소의 갯수
		System.out.println(num.length + "개");
		
		//배열의 요수 값 변경
		/*
		 * num[4] = 55; num[9] = 100;
		 */	
		
		for(int i = 0; i<11; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		//배열의 합
		System.out.println(sum);
		//배열의 평균
		System.out.println((sum/num.length));

	}

}
