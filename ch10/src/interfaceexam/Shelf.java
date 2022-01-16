package interfaceexam;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;	//자료를 객체 타입으로 저장할 변수 선언 . 
	public Shelf() { 	// 디폴트 생성자 
		shelf = new ArrayList<String>(); // 책을 꽂을 선반 객체 배열 생성
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}
}
