package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		double multi = 1; //���� ��
		int count = 0; //��ȿ�� ���� ����ִ� ��� ����
		//�� �迭 ��� �ʱ�ȭ
		data[0] = 10.0;
		count++;//1
		data[1] = 20.0;
		count++;//2
		data[2] = 30.0;
		count++;//3
		
		double sum = 0;
		double average = 0;
		
		for (int i=0; i<count; i++) {
			multi *= data[i] ;
			sum += data[i];
			average = (sum/count);
			System.out.println(data[i]);
		}
		System.out.println(multi);
		System.out.println(sum);
		System.out.println(average);
	}

}
