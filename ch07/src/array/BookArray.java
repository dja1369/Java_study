package array;

import arraylist.Book;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		//각 요소 를 초기화 : 인스턴스를 생성하고  각 요소에 대입	
		library[0] = new Book("김치찌개" ,  "백종원");
		library[1] = new Book("된장찌개" ,  "고든램지");
		library[2] = new Book("참치찌개" ,  "이연복");
		library[3] = new Book("스팸찌개" ,  "김풍");
		library[4] = new Book("부대찌개" ,  "레이먼킴");
		
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]); //인스턴스 확인
		}
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo(); // 메소드 호출하여 책 정보 확인
		}
	}

}
