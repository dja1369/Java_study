package innerclass;

class OuterClass{
	Runnable getRunnable(int i) {
		int localNum = 100;// ��������
		//�͸� ���� Ŭ���� , �̸��� �����ϰ� ��� Ŭ������ ������
		return new Runnable() {
			
			@Override
			public void run() {
				//i += 1; //���ȭ(final) �Ǳ⶧���� ���� �����Ҽ� ����
				System.out.println(i);
				//localNum += 100; ���ȭ(final) �Ǳ⶧���� �� �����Ҽ� ����
				System.out.println(localNum);
			}
		};
	}
	
	//�͸� ���� Ŭ������ �����Ͽ� ������ ����
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() { //�߻� �޼ҵ带 ����
			System.out.println("Runnable Ÿ���� ������ Run() �޼ҵ带 ������ ����");

		}
	};
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.getRunnable(1000).run();
		
		out.runnable.run();
	}

}
