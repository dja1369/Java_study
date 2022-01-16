package ifexample;

public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		
		a = 5;
		b = 7;
		
		int max = (a > b) ? a:b;
		System.out.println(max);
		
		if (a>b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
		
	}

}
