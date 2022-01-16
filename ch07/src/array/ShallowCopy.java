package array;

import arraylist.Book;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] =new Book("�����ƿ� ���� ����" , "����");
		bookArray1[1] =new Book("���̾�" , "�츣���켼");
		bookArray1[2] =new Book("�豤�� �� ���� ����" , "�ѱռ�");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
	
		//å�� �̸��� ���� �� �����ϴ� �ڵ� �߰�
		bookArray1[0].setBookName("�����");
		bookArray1[0].setAuthor("�����㺣��");
		
		for (int i =0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		for (int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
