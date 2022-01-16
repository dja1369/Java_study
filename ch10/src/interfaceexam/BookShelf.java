package interfaceexam;

public class BookShelf extends Shelf implements Queue {
	private static int count = 0;
	@Override
	public void enQueue(String title) {
		shelf.add(title); //책 제목을 객체 배열의 요소로 추가
		System.out.println(++count  + "번째 책 추가 완료" );
	}

	@Override
	public String deQueue() {
		if(shelf.size() == 0) {
			return "더이상 꺼낼 책이 없습니다";
		}else {
		return shelf.remove(0);	//항상 맨 앞의 요소가 제거됨 
		}
	}

	@Override
	public int getSize() {
		return shelf.size();	//배열의 크기 
	}
}
