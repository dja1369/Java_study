package interfaceexam;

public class CalculatorTest {

	public static void main(String[] args) {
		int[] intArray = new int[] {2,4,6,8,10};
		
		int sum = Calc.total(intArray);
		System.out.println(sum);
		
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc comCalc = new CompleteCalc();
		comCalc.showInfo();
		
		Calc calc = comCalc; // Upcasting , Ÿ��ĳ����(����ȯ) , ������ �� ��ȯ
		//calc.showInfo(); ���� : ���ǵǾ� ���� ���� , Calc Ÿ���� �������� �ʴ� �żҵ�
		
		calc.describe(); //����Ʈ �żҵ� ȣ��, �����ǰ� �� ��� ��� �����ǵ� �޼ҵ尡 ȣ���
		
		System.out.println(comCalc.add(num1, num2));
		System.out.println(comCalc.subtract(num1, num2));
		System.out.println(comCalc.multiply(num1, num2));
		System.out.println(comCalc.divide(num1, num2)); // ��
		System.out.println(comCalc.square(num1));
		num2 = 3;
		System.out.println(comCalc.mod(num1, num2)); //������ 
		num2 =0;
		System.out.println(comCalc.divide(num1, num2));
	}

}
