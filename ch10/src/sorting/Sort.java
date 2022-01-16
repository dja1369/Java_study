package sorting;

public interface Sort {
	int[] ascedning(int[] arr); //정수형 배열을 인수로 받아 오름차 순으로 정렬.
	int[] descending(int[] arr);//정수형 배열을 인수로 받아 내림차 순으로 정렬.
	//int addd(); 				//선언시 굳이 배열 선언할 필요 없음 형변환으로 변환 가능하기에 자료형 으로 
	//선언 만 해두어도 작동됨 
	void description(); // 알고리즘에 대한 설명
	/* default void description(){
	 * 구현 내용이 존재해야 하는 디폴트 메소드 
	 * syso("숫자를 정렬하는 알고리즘 입니다.)
	 * }
	 */
}
