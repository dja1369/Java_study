package arrayQuiz;

import java.util.ArrayList;

public class DogTest {

	public static void main(String[] args) {
		ArrayList<Dog> puppyList = new ArrayList<Dog>();
		Dog dog1 = new Dog("��ź��", "Ǫ��");
		Dog dog2 = new Dog("��ź��", "���");
		Dog dog3 = new Dog("��ź��", "��Ƽ��");
		Dog dog4 = new Dog("��ź��", "�����");
		Dog dog5  = new Dog("�ҹ�ź��", "�ҵ�");
		
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
