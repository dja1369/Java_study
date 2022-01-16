package interfaceexam;

public interface Queue { //선입선출 (First In First Out) , 선착순
	void enQueue(String title); //요소가 추가	되는 메소드
	String deQueue();			//요소를 제거
	int getSize();				//요소 갯수 확인
	
}
