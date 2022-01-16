package arrayQuiz;

import java.util.ArrayList;

import arraylist.Subject;

public class Dog {
	private String name;
	private String type;
	ArrayList<DogList> dogList;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
		dogList = new ArrayList<DogList>();
	}
	
	public void addDogList(String name , String type) {
		DogList listdog = new DogList();
		listdog.setDogName(name);
		listdog.setDogType(type);
		dogList.add(listdog);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void showDogInfo() {
		System.out.println( "강아지의 이름은 , " +name + ",강아지의 종류는 ," + type );
	}
}
