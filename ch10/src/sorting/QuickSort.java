package sorting;

public class QuickSort implements Sort {

	@Override
	public void description() {
		//Sort.super.description //super �� �̿��� �޼ҵ� ȣ��
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
		System.out.println("QuickSort �Դϴ�.");
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
