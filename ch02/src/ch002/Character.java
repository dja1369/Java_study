package ch002;

public class Character {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		
		ch1 = 'B';
		System.out.println(ch1);
		
		char ch2 = 65;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int i = 66;
		System.out.println(i);
		System.out.println((char)i);
		
		// �ҹ��� 'a'�� �ƽ�Ű �ڵ� ����
		System.out.println((int)'a');
		// �빮�� 'Z'�� �ƽ�Ű �ڵ� ����
		ch2 = 'Z';
		System.out.println((int)ch2);
		// �ƽ�Ű�ڵ� �� 38�� �ش�Ǵ� ���ڴ�
		i = 38;
		System.out.println((char)i);
		
		//char type : �������� ���� �Ұ���
//		ch2 = -65; // type mismatch OoO
		i = -65;
		
		char ch3 ='��';
		System.out.println(ch3);
		
		char ch4 = '\uD55C';
		System.out.println(ch4);
		
		char ch5 = '\uAD6D';
		System.out.println(ch5);
		
	}

}
