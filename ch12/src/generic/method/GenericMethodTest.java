package generic.method;

import java.awt.Rectangle;

public class GenericMethodTest {

	public static void main(String[] args) {
		//�� ��ǥ�� ����
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 10.0);//�����Ϸ��� ���� �Ͽ� <Integer ,Double>
		Point<Integer, Double> p2 = new Point<Integer, Double>(10, 0.0);
		
		//�簢���� ���� ���ϱ�
		double rectangle = GenericMethod.makeRectangle(p1, p2);
		System.out.println("���� p1(" + p1.getX() + ","+ p1.getY() + " ) ,p2("+ p2.getX() +
			", " + p2.getY() + " ) �� ������� �簢���� ���̴� " + rectangle + " �Դϴ�"	);
	}

}
