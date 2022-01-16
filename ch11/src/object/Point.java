package object;

public class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { //객체의 정보를 문자열로 변환 , 인스턴스 혹은 참조변수 로 즉시 호출 가능.
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
