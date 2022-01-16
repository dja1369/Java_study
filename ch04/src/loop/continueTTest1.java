package loop;

public class continueTTest1 {

	public static void main(String[] args) {

		/*for (int i = 2; i < 10; i++) {
			if (i % 2 != 0)
				continue;
			for (int k = 1; k < 10; k++) {
				System.out.println(i + "´Ü =" + i * k + ".");
		*/		
		for (int i = 2; i < 10; i++) {
			for (int k = 1; k < 10; k++) {
				if (i <= k)
					break;
				System.out.println(i + "´Ü =" + i * k + ".");
				
	}
		}
	}
}
