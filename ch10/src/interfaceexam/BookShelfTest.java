package interfaceexam;

public class BookShelfTest {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		
		//요소를 추가 
		bookShelf.enQueue("자바 프로그래밍");
		bookShelf.enQueue("안드로이드 프로그래밍");
		bookShelf.enQueue("데이터베이스 프로그래밍");
		bookShelf.enQueue("옥 탑 방 에서 복 덕 방 ");
	
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
			
	}
}
