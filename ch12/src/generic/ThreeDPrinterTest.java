package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder powder = new Powder(); //������ ����ȯ (�� ĳ����)
		printer.setMaterial(powder);
		
		Powder obj = (Powder) printer.getMaterial(); //����� ����ȯ (�ٿ� ĳ����)
		System.out.println(obj);//toString �޼ҵ� �ڵ� ȣ��
		
	
	}

}
