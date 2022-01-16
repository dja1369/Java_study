package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array01 = new int[] {10,20,30,40,50};
		int[] array02 = new int[] {1,2,3,4,5};
		
		System.arraycopy(array01, 0, array02, 1, 3);
	
		for(int i=0; i<array02.length; i++) {
			System.out.println(array02[i]);
		}
	
	}

}
