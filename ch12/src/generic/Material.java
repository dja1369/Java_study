package generic;

public abstract class Material {
	public abstract void doPrinting(); //추상 메소드
	public void printing() { 	//구현된 일반 메소드
		System.out.println("프린터기에 투입한 " + getClass().getSimpleName() + " 재료로 출력 합니다.");
	}

}
