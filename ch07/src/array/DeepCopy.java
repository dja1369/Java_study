package array;

import arraylist.Book;

public class DeepCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] =new Book("�����ƿ� ���� ����" , "����");
		bookArray1[1] =new Book("���̾�" , "�츣���켼");
		bookArray1[2] =new Book("�豤�� �� ���� ����" , "�ѱռ�");
		
		//����Ʈ �����ڷ� ���ο� �ν��Ͻ��� ����
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//�� ����� ���� ������ �ν��Ͻ��� ��� ���� ������ ����
		//�ݺ����� ����Ͽ� bookArray1���� ��ȸ�� å �̸��� ���� �̸��� ����
		for(int i=0;  i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
	
		System.out.println(bookArray1[0].getBookName());
//		bookArray1[0].getBookName();
		
		for (int i =0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		/*
		 * for (int i =0; i<bookArray2.length; i++) { bookArray2[i].showBookInfo(); }
		 */
		for (Book bookArray3 : bookArray1) {
			bookArray3.showBookInfo();
		}
		
		bookArray1[0].setBookName("�����");
		bookArray1[0].setAuthor("�����㺣��");
		
	}

}
