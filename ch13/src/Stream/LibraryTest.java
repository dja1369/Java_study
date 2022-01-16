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
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		int allbook = bookList.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println(allbook);
		
		bookList.stream().filter(b -> b.getPrice() >=20000).forEach(book -> System.out.println(book.toString()));

		//���� ��� å ���� �� å �̸��� ��� 
		//OptionalInt�� ���� �ִ밪�� ���� ������ ������� GetAsInt()�� �̿��Ͽ� ��ü ���� ��ȯ
		int maxPrice = bookList.stream().mapToInt(b -> b.getPrice()).max().getAsInt();
		System.out.println("���� ��� å �� : " + maxPrice + "��");
		
		//���� ��� å �̸�
		bookList.stream().filter(book -> book.getPrice() == maxPrice).map(book -> book.getName()).forEach(book -> System.out.println(book));
	}

}
