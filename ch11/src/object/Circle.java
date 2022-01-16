package object;
					//implements Cloneable : 복제 를 허용 하는 인터페이스 ,,,  를 구현해야 사용 가능
					//구현 코드는 따로 없음
public class Circle implements Cloneable {
	Point point; //한 점
 	int radius;  //반지름
 	
 	Circle(int x , int y , int radius){
 		point = new Point(x, y);
 		this.radius = radius;
 		
 	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//clone() 메소드를 호출 할때 발생할 가능성이 있는 예외 처리
		return super.clone();
	}

 	
}
