package loop;

public class gugudan {

	public static void main(String[] args) {

		/*
		 * for (int i=2; i<10; i++) { for(int k=1; k<10; k++) {
		 * System.out.println(i+"단 ="+i*k+"."); } System.out.println(i + "단 종료"); }
		 */
		/*
		 * var i = 2; while (i < 10) { int k = 1; while (k < 10) { System.out.println(i
		 * + "단=" + i*k ); k++; } if(i%2 == 0) { i++; } i++; }
		 */

		var i = 2;
		while (i < 10) {
			int k = 1;
			while (k < 10) {
				System.out.println(i + "단=" + i * k);
				k++;
				if (i <= k)
					break;
			}
			i++;
		}
	}

}
