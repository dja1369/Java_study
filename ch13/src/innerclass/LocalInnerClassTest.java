package innerclass;

class Outer{
	int outerNum = 100; 	//�ν��Ͻ� ���� 
	static int sNum = 200; 	//����ƽ ���� , ���� ����
	
	Runnable getRunnable(int i) {//Ÿ���� ��ȯ�ϴ� �޼ҵ�
		int localNum = 300; //���� ����
		
		class MyRunnable implements Runnable{// ���� ���� Ŭ����
			int iNum = 1;//���� ���� Ŭ������ �ν��Ͻ� ����
			@Override
			public void run() {
				//�޼ҵ� �� �Ű������� ���������� ������ �����ϳ� ������ �Ұ����� final �� �����Ϸ��� ������
			//	localNum += 300 ���� 
				//i += 1000; // ������ �Ұ��� final field �� �����
				System.out.println(" i : " + i); //�Ű����� �� ����
				System.out.println(" localNum : " + localNum);//���������� ����
				System.out.println(" iNum : " + iNum);
				System.out.println(" outerNum : " + outerNum);
				System.out.println(" sNum : " + sNum);
			}	
		}
		//���� ���� Ŭ������ �̸��� Ŭ������ �����ؼ� ��ȯ �Ҷ��� ���
		return new MyRunnable();	//Runnable �� ������ MyRunnable ��ü�� �����Ͽ� ��ȯ;
	}
}


public class LocalInnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(1000);
		runnable.run();
	}

}
