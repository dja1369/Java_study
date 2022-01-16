package loop;

public class whiletest {

	public static void main(String[] args) {
		var num = 1;
		var sum = 0;
		
		do {
			sum += num;
			//System.out.println(num +","+ sum);
			num ++;
		}while (num <=10);
		
		/*while(num <=10) {
			sum += num;
			//System.out.println(num +","+ sum);
			num ++;
		}*/
		System.out.println("1~10 ±îÁö ÇÕ: "+sum);
	}

}
