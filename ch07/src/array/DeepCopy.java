package array;

import arraylist.Book;

public class DeepCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] =new Book("최정훈에 대한 고찰" , "기모띠");
		bookArray1[1] =new Book("데미안" , "헤르만헤세");
		bookArray1[2] =new Book("김광현 에 대한 고찰" , "총균쇠");
		
		//디폴트 생성자로 새로운 인스턴스를 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		//각 요소의 값을 생성된 인스턴스의 멤버 변수 값으로 복사
		//반복문을 사용하여 bookArray1으로 조회한 책 이름과 저자 이름을 설정
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
		
		bookArray1[0].setBookName("어린왕자");
		bookArray1[0].setAuthor("생텍쥐베리");
		
	}

}
