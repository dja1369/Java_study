package quiz;

public abstract class Car {
	
	public void drive() {
		System.out.println("�޸��ϴ�.");
	}
	public void stop() {
		System.out.println("����ϴ�.");
	}

	public void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	
	
	public void turnoOffCar() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {
		System.out.println(getClass().getSimpleName() +" ������ �մϴ�.");
	}
	
	//���� Ŭ�������� ����� �޾� ����� �� ������ �� �� ����. Ű���� final
	 public void run() {     //������ �Ϸ��� �帧�� �޼���� ���� ���� ���ø� �޼����� ��.
		startCar();
		drive();
		stop();
		turnoOffCar();
		washCar();
	}
}
