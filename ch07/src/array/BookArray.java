package array;

import arraylist.Book;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		//�� ��� �� �ʱ�ȭ : �ν��Ͻ��� �����ϰ�  �� ��ҿ� ����	
		library[0] = new Book("��ġ�" ,  "������");
		library[1] = new Book("�����" ,  "��緥��");
		library[2] = new Book("��ġ�" ,  "�̿���");
		library[3] = new Book("�����" ,  "��ǳ");
		library[4] = new Book("�δ��" ,  "���̸�Ŵ");
		
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]); //�ν��Ͻ� Ȯ��
		}
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo(); // �޼ҵ� ȣ���Ͽ� å ���� Ȯ��
		}
	}

}
