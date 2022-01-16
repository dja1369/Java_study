package class_exam;

public class MyDog {
	String name;
	String type;
	
	public MyDog(String name , String type) {
		this.name = name;
		this.type = type;
	}
	@Override //인스턴스의 정보를 확인 출력함
	public String toString() {
		return type + " , " + name;
	}
}
