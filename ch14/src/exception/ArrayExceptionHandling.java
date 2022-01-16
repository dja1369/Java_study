package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] array = new int[5];
		try {
			for (int i = 0; i <= array.length; i++) {
				array[i] = i + 1; // 배열 요소 초기화
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { // 발생한 예외를 처리하는 블록
			System.out.println(e/* .toString() */);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("예외가 발생하든 않든 항상 수행되는 블록");
		}
		System.out.println(" END "); //여기까지 도달하면 정상 종료.
	}

}
