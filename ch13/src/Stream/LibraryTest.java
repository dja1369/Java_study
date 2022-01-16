package Stream;

import java.util.ArrayList;
import java.util.List;


class Book{
	private String name;
	private int price;
	
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}


public class LibraryTest {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		int allbook = bookList.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println(allbook);
		
		bookList.stream().filter(b -> b.getPrice() >=20000).forEach(book -> System.out.println(book.toString()));

		//가장 비싼 책 값과 그 책 이름을 출력 
		//OptionalInt로 얻어온 최대값을 정수 값으로 얻기위해 GetAsInt()을 이용하여 객체 값을 반환
		int maxPrice = bookList.stream().mapToInt(b -> b.getPrice()).max().getAsInt();
		System.out.println("가장 비싼 책 값 : " + maxPrice + "원");
		
		//가장 비싼 책 이름
		bookList.stream().filter(book -> book.getPrice() == maxPrice).map(book -> book.getName()).forEach(book -> System.out.println(book));
	}

}
