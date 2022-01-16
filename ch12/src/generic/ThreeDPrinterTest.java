package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder powder = new Powder(); //묵시적 형변환 (업 캐스팅)
		printer.setMaterial(powder);
		
		Powder obj = (Powder) printer.getMaterial(); //명시적 형변환 (다운 캐스팅)
		System.out.println(obj);//toString 메소드 자동 호출
		
	
	}

}
