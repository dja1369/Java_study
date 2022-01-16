package arrayQuiz;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		ArrayList<Dog> puppyList = new ArrayList<Dog>();
		Dog dog1 = new Dog("ø¨≈∫¿Ã", "«™µÈ");
		Dog dog2 = new Dog("±Ë≈∫¿Ã", "∫Òºı");
		Dog dog3 = new Dog("√÷≈∫¿Ã", "∏ª∆º¡Ó");
		Dog dog4 = new Dog("∞Ì≈∫¿Ã", "∑°∫Í∂Ûµµ");
		Dog dog5  = new Dog("∫“πﬂ≈∫¿Ã", "∫“µ∂");
		
		puppyList.add(dog1);
		puppyList.add(dog2);
		puppyList.add(dog3);
		puppyList.add(dog4);
		puppyList.add(dog5);
		
		
		for(int i=0; i<puppyList.size(); i++) {
			Dog dog = puppyList.get(i);
			dog.showDogInfo();
		}
		
		for (Dog Wal : puppyList) {
			System.out.println(Wal.showDogInfo());
		}
	}

}
