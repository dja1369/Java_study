package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� ���� �ϼ���");
		System.out.println("B : BubbleSort");
		System.out.println("H : HardSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null; //��� �ڷ����� ���� �ְ� Null ����
		
		if(ch == 'B' || ch== 'b') {
			sort = new BubbleSort();
		}else if (ch == 'H' || ch == 'b'){
			sort = new HardSort();
		}else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}else {
			System.out.println("�������� �ʴ� ��� �Դϴ�");
			return ;
		}
		
		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
		
	}

}
