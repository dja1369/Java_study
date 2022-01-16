package quiz;

public abstract class Car {
	
	public void drive() {
		System.out.println("달립니다.");
	}
	public void stop() {
		System.out.println("멈춥니다.");
	}

	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	
	
	
	public void turnoOffCar() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {
		System.out.println(getClass().getSimpleName() +" 세차를 합니다.");
	}
	
	//하위 클래스에서 상속을 받아 사용할 때 재정의 할 수 없음. 키워드 final
	 public void run() {     //정해진 일련의 흐름을 메서드로 만든 것을 템플릿 메서드라고 함.
		startCar();
		drive();
		stop();
		turnoOffCar();
		washCar();
	}
}
