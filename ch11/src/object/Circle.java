package object;
					//implements Cloneable : ���� �� ��� �ϴ� �������̽� ,,,  �� �����ؾ� ��� ����
					//���� �ڵ�� ���� ����
public class Circle implements Cloneable {
	Point point; //�� ��
 	int radius;  //������
 	
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
		//clone() �޼ҵ带 ȣ�� �Ҷ� �߻��� ���ɼ��� �ִ� ���� ó��
		return super.clone();
	}

 	
}
