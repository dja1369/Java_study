package polymophrsim.TypeCheak;

import java.util.ArrayList;

class Animal {// ����Ŭ����
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}

}

class Human extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("����� �ι߷� �����Դϴ�.");
	}

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("ȣ���̰� �׹߷� �����Դϴ�.");
	}

	public void hunting() {
		System.out.println("ȣ���̴� ����� �մϴ�");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}

	public void flying() {
		System.out.println("�������� �ϴ��� ���� ���� �ٴմϴ�");
	}
}

public class AnimalTest2 {
	// ������ �ν��Ͻ��� ������ ��ü �迭 ����.
	ArrayList<Animal> animalList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aniTest = new AnimalTest2();
		aniTest.addAnimal();
		System.out.println("==============================");
		//aniTest.downCasting();
		System.out.println("==============================");
		aniTest.up_down_cast();

	}

	void addAnimal() { // ������ �ν��Ͻ��� ��ü�迭�� �߰��ϴ� �޼ҵ�
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		animalList.add(new Human());

		// ��ü �迭�� �߰��� �ν��Ͻ��� ����ϴ� �޼ҵ�
		//for (Animal animal : animalList) {
			//animal.move(); // �ν��Ͻ��� �޼ҵ尡 ���� ȣ��� : ���⼺ ����

		}
	

	// �ٿ� ĳ���� �Ͽ� Ÿ���� üũ�Ͽ� �� �ν��Ͻ��� ���� �޼ҵ带 ȣ��
	void downCasting() {
		for (Animal animal : animalList) {
			// if (�ν��Ͻ�[��ü] instanceof Ŭ���� �ڷ��� [Ÿ��] : ������ üũ �ϱ� ���� Ÿ�� üũ
			if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}else if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			}else {
				System.out.println("��ȯ �Ҽ� ���� Ÿ��");
			}
		}
	}
	void up_down_cast() {
		for (Animal animal : animalList) {
			if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				animal.move();
				eagle.flying();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				animal.move();
				tiger.hunting();
			}else if (animal instanceof Human) {
				Human human = (Human) animal;
				animal.move();
				human.readBook();
			}else {
				System.out.println("��ȯ �Ҽ� ���� Ÿ��");
			}
	}
}}
