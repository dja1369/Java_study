package generic.method;

import java.awt.Rectangle;

public class GenericMethodTest {

	public static void main(String[] args) {
		//두 좌표점 생성
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 10.0);//컴파일러가 유추 하여 <Integer ,Double>
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 0.0);
		
		//사각형의 면적 구하기
		double rectangle = GenericMethod.makeRectangle(p1, p2);
		System.out.println("두점 p1(" + p1.getX() + ","+ p1.getY() + " ) ,p2("+ p2.getX() +
			", " + p2.getY() + " ) 로 만들어진 사각형의 넓이는 " + rectangle + " 입니다"	);
	}

}
