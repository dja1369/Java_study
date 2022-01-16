package stream.serialization;

import java.io.Serializable;
//java.io.NotSerializableException: 직렬화 하겠다는 의사를 표현
public class Person implements Serializable {
	//표시 인터페이스, 마커 인터페이스 
	/**
	 *  직렬화를 위한 버전 번호를 생성하기 위해 Person 클래스명 위에 마우스를 올려 두고
	 *  Add generate serial version ID 를 클릭해서 자동 생성.
	 */
	private static final long serialVersionUID = 7263966142232951976L;
	String name;
	transient String job; //복원 과정에서 제외할 변수 는 transient 예약어 사용 , 기본 값으로 역직렬화 되어서 나옴.
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
