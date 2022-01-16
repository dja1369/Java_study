package polymorphism;

import polymophrsim.TypeCheak.Animal;
import polymophrsim.TypeCheak.Eagle;
import polymophrsim.TypeCheak.Human;

class Animal {//상위클래스
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

}
class Human extends Animal{

	@Override
	public void move() {
		super.move();
		System.out.println("사람이 두발로 움직입니다.");
	}
	
}

class tiger extends Animal{

	@Override
	public void move() {
		super.move();
		System.out.println("호랑이가 네발로 움직입니다.");
	}

}

class Eagle extends Animal{

	@Override
	public void move() {
		super.move();
		System.out.println("독수리가 하늘을 납니다.");
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
	void moveAnimal(Animal animal) { //매개 변수의 타입이 상위 클래스 타입으로 사용
		animal.move();	//가상 매소드: 인스턴스의 매소드 호출, 오버 라이딩 메소드 를 호출.
	}
}
