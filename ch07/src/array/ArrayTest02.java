package array;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		double[] data = new double[5];
		
		//각 배열 요수 초기화
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for (int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}

}
