package quiz;

public class Grandeur extends Car {

	@Override
	public void drive() {
		System.out.println(" Grandeur �޸��ϴ�.");
	}

	@Override
	public void startCar() {
		System.out.println(" Grandeur �õ��� �մϴ�.");
	}

	@Override
	public void turnoOffCar() {
		System.out.println(" Grandeur �õ��� ���ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(" Grandeur ����ϴ�.");
	}
}