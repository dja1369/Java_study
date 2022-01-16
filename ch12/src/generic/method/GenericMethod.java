package generic.method;

public class GenericMethod {
	//두 점이 정수 또는 실수로 만들어질 수 있기 때문에 제너릭 메소드로 만듬
	//p1(0, 10.0) p2(10, 0.0)
	public static <T , V> double makeRectangle(Point<T, V> p1,Point<T, V> p2) {
		int left = (int)p1.getX();
		int right = (int)p2.getX();
		double top = (double)p1.getY();
		double bottom = (double)p2.getY();
		
		//너비 
		int width = right - left;
		//높이
		double height = top - bottom;

		return width * height;
	}
	
	
}
