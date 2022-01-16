package generic.method;

public class Point<T, V> {
	//T, V : 자료형 매개 변수
	
	private T x;
	private V y;

	//생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

	
}
