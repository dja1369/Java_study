package NewGeneric_PDD;

public abstract class Material { // 추상 클래스
	public abstract void toDoPrint(); //추상 메소드
	public void toPrint(){ // Created Method.
		System.out.println("프린터 기에 투입한 재료 인 " + getClass().getSimpleName() + " 으로 출력됩니다");
	}
}
