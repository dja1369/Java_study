package array;

public class ArrayTest01 {

	public static void main(String[] args) {
		//������ �迭 ������ ���ÿ� �ʱ�ȭ
		int sum =0;
		int[] num = new int[] { 0,1,2,3,4,5,6,7,8,9,10};
		//�迭 ����� ����
		System.out.println(num.length + "��");
		
		//�迭�� ��� �� ����
		/*
		 * num[4] = 55; num[9] = 100;
		 */	
		
		for(int i = 0; i<11; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		//�迭�� ��
		System.out.println(sum);
		//�迭�� ���
		System.out.println((sum/num.length));

	}

}
