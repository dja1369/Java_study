package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/* ArrayList<String> stringList = new ArrayList<String>();

		stringList.add("abc");
		stringList.add("def");
		stringList.add("ghi");
		
		//����� ����
		System.out.println("����� ����" + stringList.size());
		for(int i=0; i<stringList.size(); i++) {
			String str = stringList.get(i);
			System.out.println(str);
		}
		for(String str : stringList) {
			System.out.println(str);
		}
	*/	
		
		ArrayList<Book> bookList =new ArrayList<>();
		Book book1 = new Book("�ڹ�1", "�������б�");
		Book book2 = new Book("�ڹ�2", "�������б�");
		Book book3 = new Book("�ڹ�3", "�������б�");
		Book book4 = new Book("�ڹ�4", "�������б�");
		Book book5 = new Book("�ڹ�5", "�������б�");
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		
		
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			System.out.println(book);
			book.showBookInfo();
		}
		System.out.println("=======================");
		
		for(Book book : bookList) {
			book.showBookInfo();
		}
		
	}

}
