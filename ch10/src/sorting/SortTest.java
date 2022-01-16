package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택 하세요");
		System.out.println("B : BubbleSort");
		System.out.println("H : HardSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null; //모든 자료형이 담길수 있게 Null 선언
		
		if(ch == 'B' || ch== 'b') {
			sort = new BubbleSort();
		}else if (ch == 'H' || ch == 'b'){
			sort = new HardSort();
		}else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}else {
			System.out.println("존재하지 않는 방식 입니다");
			return ;
		}
		
		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
		
	}

}
