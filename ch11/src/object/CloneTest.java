package object;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException { //System.identityHashcode // 실제 주소 값
		Circle circle = new Circle(5, 7, 3);
		System.out.println(System.identityHashCode(circle));
		Circle newCircle = (Circle)circle.clone(); //downCasting 
		System.out.println(System.identityHashCode(newCircle));
		
		System.out.println(circle);
		System.out.println(newCircle);
	}

}
