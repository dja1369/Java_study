package lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		//���ٽ��� �������̽� Ÿ���� ������ ����
		MyNumber max = (x,y) -> (x > y) ? x:y; //getMaxNum�� ������
		
		int maxNum = max.getMaxNum(100, 200); //�������̽� Ÿ���� ������ ������ �޼ҵ� ȣ��
		System.out.println(maxNum);
		
		//�͸� ��ü�� �����ϴ� �͸� ���� Ŭ���� 
		MyNumber myNum = new MyNumber() {
			//�̸��� ���� Ŭ���� ������
			@Override
			public int getMaxNum(int num1, int num2) { //�߻� �޼ҵ� ����
				int maxNumber = (num1>num2) ? num1: num2;
				return maxNum;
			}
		};
		
		System.out.println(myNum.getMaxNum(100, 200));
	
	}

}
