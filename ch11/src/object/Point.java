package object;

public class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { //��ü�� ������ ���ڿ��� ��ȯ , �ν��Ͻ� Ȥ�� �������� �� ��� ȣ�� ����.
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
