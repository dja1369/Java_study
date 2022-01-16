package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/* ArrayList<String> stringList = new ArrayList<String>();

		stringList.add("abc");
		stringList.add("def");
		stringList.add("ghi");
		
		//요소의 갯수
		System.out.println("요소의 갯수" + stringList.size());
		for(int i=0; i<stringList.size(); i++) {
			String str = stringList.get(i);
			System.out.println(str);
		}
		for(String str : stringList) {
			System.out.println(str);
		}
	*/	
		
		ArrayList<Book> bookList =new ArrayList<>();
		Book book1 = new Book("자바1", "동서대학교");
		Book book2 = new Book("자바2", "동서대학교");
		Book book3 = new Book("자바3", "동서대학교");
		Book book4 = new Book("자바4", "동서대학교");
		Book book5 = new Book("자바5", "동서대학교");
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
