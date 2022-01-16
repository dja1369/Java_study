package interfaceexam;

public class BookShelf extends Shelf implements Queue {
	private static int count = 0;
	@Override
	public void enQueue(String title) {
		shelf.add(title); //å ������ ��ü �迭�� ��ҷ� �߰�
		System.out.println(++count  + "��° å �߰� �Ϸ�" );
	}

	@Override
	public String deQueue() {
		if(shelf.size() == 0) {
			return "���̻� ���� å�� �����ϴ�";
		}else {
		return shelf.remove(0);	//�׻� �� ���� ��Ұ� ���ŵ� 
		}
	}

	@Override
	public int getSize() {
		return shelf.size();	//�迭�� ũ�� 
	}
}
