package interfaceexam;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;	//�ڷḦ ��ü Ÿ������ ������ ���� ���� . 
	public Shelf() { 	// ����Ʈ ������ 
		shelf = new ArrayList<String>(); // å�� ���� ���� ��ü �迭 ����
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}
}
