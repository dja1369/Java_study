package lamda;

//�Լ��� �������̽�
@FunctionalInterface
interface PrintString{
	public void showString(String str);
}

public class LamdaTest {

	public static void main(String[] args) {
		//�Լ��� ����ó�� ����ϴ� ���ٽ� 3������ ���
		PrintString lamdaStr = str -> System.out.println(str);
		lamdaStr.showString("������" + " �������̽� �� ������ ���ٽ� ����.");
		
		//�Ű������� Ÿ���� �������̽� Ÿ��(�޼ҵ��� �Ű������� ������ ���ٽĿ� ���ԵǾ� ������ ����)
		showMyString(lamdaStr); //���� �޼ҵ� ȣ��
		
		//��ȯ���� �������̽� Ÿ���� ������ ���� ����
		PrintString rtnStr = returnString();
		rtnStr.showString("�Ƹ�����" );
	}
	static void showMyString(PrintString pStr) { //���޵Ǵ� �Ű� ������ �������̽� Ÿ��.
		pStr.showString("�ͷ��̸�" + " �Ű������� �����ϴ� ���ٽ�");
	}
	public static PrintString returnString() {
		//���� ���� ���ڿ��� �����Ͽ� ��ȯ�ϵ��� �޼ҵ� �� ����
		return str -> System.out.println(str + " ��ȯ������ ���Ǵ� ���ٽ�");
	}
}
