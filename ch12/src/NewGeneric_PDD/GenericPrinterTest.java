package NewGeneric_PDD;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Ÿ�� ���
		powderPrinter.setMaterial(new Powder()); //�Ŀ�� Ÿ�� ���� ����
		Powder powder = powderPrinter.getMaterial();//�ٿ�ĳ���� �ʿ� X ������ ����ȯ 
		System.out.println(powder);	
		powder.toDoPrint(); //�߻� �޼ҵ�� �����Ѱ�
		powder.toPrint(); //���� �Ǿ� �ִ� �޼ҵ�� ����

		GenericPrinter plasticPrinter = new GenericPrinter(); //���(Ÿ��)�� ������� ����
		plasticPrinter.setMaterial(new Plastic()); //�ö�ƽ Ÿ�� ���� ����
		Plastic plastic = (Plastic) plasticPrinter.getMaterial(); //���� ����ȯ �ʼ� O ����� ����ȯ
		System.out.println(plastic);
		plastic.toDoPrint(); //�߻� �޼ҵ�� ����
		plasticPrinter.toPrint(); //���� �Ǿ� �ִ� �޼ҵ�� ����
		
	}

}
