package interfaceexam;

public class BookShelfTest {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		
		//��Ҹ� �߰� 
		bookShelf.enQueue("�ڹ� ���α׷���");
		bookShelf.enQueue("�ȵ���̵� ���α׷���");
		bookShelf.enQueue("�����ͺ��̽� ���α׷���");
		bookShelf.enQueue("�� ž �� ���� �� �� �� ");
	
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
			
	}
}
