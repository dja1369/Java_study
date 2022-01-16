package ch002;

public class FloatDouble {

	public static void main(String[] args) {
		float fNum = 3.14f; // float 타입은 접미사 'f'를 사용한다
		double dNum = 3.14;
		
		System.out.println(fNum);
		System.out.println(dNum);
		
		dNum = fNum;
		System.out.println(dNum);

	}

}
