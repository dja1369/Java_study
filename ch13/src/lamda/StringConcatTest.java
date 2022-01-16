package lamda;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Programming";
		
		StringConcat concat = new StringConcatClass(); //�������̽� Ÿ���� ���������� ������ �ν��Ͻ��� ����
		concat.makeString(s1, s2); //������ �޼ҵ� ȣ��(���� �޼ҵ�)
		
		int localNum = 100;
		
		
		//���ٽ����� �������̽��� ���� , �ݵ�� �߻� �޼ҵ带 �ϳ��� ���� �Լ��� �������̽� �� ���� 
		StringConcat concatLamda = (str1 , str2) -> {
			//localNum = 200;
			//���ٽ��� ���κ����� �ΰ� �̻��� �ɰ�� �߰�ȣ �� �־���� �Ǵ� return�� �����ҋ��� �߰�ȣ�� �־����
			System.out.println(localNum); //������ ������ ������ �Ұ��� Why? final ��� �̱� ����.
			System.out.println(str1 + " " + str2);
		};
		
		concatLamda.makeString(s1, s2);

		//�͸� ��ü�� �����ϴ� ���ٽ�: �������̽� ���� ������ �޼ҵ��� �����θ� ��������.
		StringConcat concatAnonymous = new StringConcat() {
			
			@Override
			public void makeString(String str1, String str2) {
				System.out.println(str1 + " " + str2);
			}
		};
		
	}

}
