package array;

import arraylist.Book;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] =new Book("최정훈에 대한 고찰" , "기모띠");
		bookArray1[1] =new Book("데미안" , "헤르만헤세");
		bookArray1[2] =new Book("김광현 에 대한 고찰" , "총균쇠");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
	
		//책의 이름과 저자 를 변경하는 코드 추가
		bookArray1[0].setBookName("어린왕자");
		bookArray1[0].setAuthor("생텍쥐베리");
		
		for (int i =0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		for (int i =0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
