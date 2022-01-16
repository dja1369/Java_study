package NewGeneric_PDD;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //타입 명시
		powderPrinter.setMaterial(new Powder()); //파우더 타입 으로 생성
		Powder powder = powderPrinter.getMaterial();//다운캐스팅 필요 X 묵시적 형변환 
		System.out.println(powder);	
		powder.toDoPrint(); //추상 메소드로 구현한것
		powder.toPrint(); //구현 되어 있는 메소드로 구현

		GenericPrinter plasticPrinter = new GenericPrinter(); //재료(타입)를 명시하지 않음
		plasticPrinter.setMaterial(new Plastic()); //플라스틱 타입 으로 생성
		Plastic plastic = (Plastic) plasticPrinter.getMaterial(); //강제 형변환 필수 O 명시적 형변환
		System.out.println(plastic);
		plastic.toDoPrint(); //추상 메소드로 구현
		plasticPrinter.toPrint(); //구현 되어 있는 메소드로 구현
		
	}

}
