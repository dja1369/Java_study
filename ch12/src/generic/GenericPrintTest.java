package generic;

public class GenericPrintTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();//다운캐스팅 필요 X
		System.out.println(powder);
		powder.doPrinting();
		powder.printing();

		GenericPrinter plasticPrinter = new GenericPrinter(); //재료를 명시하지 않음
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = (Plastic) plasticPrinter.getMaterial(); //강제 형변환 필수
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
