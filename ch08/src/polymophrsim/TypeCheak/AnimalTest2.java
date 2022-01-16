package polymophrsim.TypeCheak;

import java.util.ArrayList;

class Animal {// 상위클래스
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

}

class Human extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("사람이 두발로 움직입니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Tiger extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("호랑이가 네발로 움직입니다.");
	}

	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
		super.move();
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리는 하늘을 훨훨 날아 다닙니다");
	}
}

public class AnimalTest2 {
	// 생성될 인스턴스가 저장할 객체 배열 생성.
	ArrayList<Animal> animalList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aniTest = new AnimalTest2();
		aniTest.addAnimal();
		System.out.println("==============================");
		//aniTest.downCasting();
		System.out.println("==============================");
		aniTest.up_down_cast();

	}

	void addAnimal() { // 생성된 인스턴스를 객체배열에 추가하는 메소드
		animalList.add(new Eagle());
		animalList.add(new Tiger());
		animalList.add(new Human());

		// 객체 배열에 추가된 인스턴스를 출력하는 메소드
		//for (Animal animal : animalList) {
			//animal.move(); // 인스턴스의 메소드가 각각 호출됨 : 다향성 구현

		}
	

	// 다운 캐스팅 하여 타입을 체크하여 각 인스턴스가 갖는 메소드를 호출
	void downCasting() {
		for (Animal animal : animalList) {
			// if (인스턴스[객체] instanceof 클래스 자료형 [타입] : 오류를 체크 하기 위해 타입 체크
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
				System.out.println("변환 할수 없는 타입");
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
				System.out.println("변환 할수 없는 타입");
			}
	}
}}
