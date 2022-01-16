package polymorphism;

import polymophrsim.TypeCheak.Animal;
import polymophrsim.TypeCheak.Eagle;
import polymophrsim.TypeCheak.Human;

class Animal {//����Ŭ����
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}

}
class Human extends Animal{

	@Override
	public void move() {
		super.move();
		System.out.println("����� �ι߷� �����Դϴ�.");
	}
	
}

class tiger extends Animal{

	@Override
	public void move() {
		super.move();
		System.out.println("ȣ���̰� �׹߷� �����Դϴ�.");
	}

}

class Eagle extends Animal{

	@Override
	public void move() {
		super.move();
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
}
public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest animal = new AnimalTest();
		
		Human human = new Human();
		Eagle eagle = new Eagle();
		//animal.move();
		
		animal.moveAnimal(new Human());
	}
	void moveAnimal(Animal animal) { //�Ű� ������ Ÿ���� ���� Ŭ���� Ÿ������ ���
		animal.move();	//���� �żҵ�: �ν��Ͻ��� �żҵ� ȣ��, ���� ���̵� �޼ҵ� �� ȣ��.
	}
}
