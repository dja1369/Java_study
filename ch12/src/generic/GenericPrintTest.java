package generic;

public class GenericPrintTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();//�ٿ�ĳ���� �ʿ� X
		System.out.println(powder);
		powder.doPrinting();
		powder.printing();

		GenericPrinter plasticPrinter = new GenericPrinter(); //��Ḧ ������� ����
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = (Plastic) plasticPrinter.getMaterial(); //���� ����ȯ �ʼ�
		System.out.println(plastic);
		plastic.doPrinting();
		plasticPrinter.printing();
		/*
		 * GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
		 * waterPrinter.setMaterial(new Water()); Water water =
		 * waterPrinter.getMaterial(); System.out.println(water);
		 */
		
	}

}
