package sorting;

public class QuickSort implements Sort {

	@Override
	public void description() {
		//Sort.super.description //super 를 이용한 메소드 호출
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
		System.out.println("QuickSort 입니다.");
	}

	@Override
	public int[] ascedning(int[] arr) {
		System.out.println("QuickSort ascedning");
		return null;
	}

	@Override
	public int[] descending(int[] arr) {
		System.out.println("QuickSort descending");
		return null;
	}

}
