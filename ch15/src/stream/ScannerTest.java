package stream;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ǥ�� �Է����κ��� �ڷḦ �о� ����. 
		
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();
	
		System.out.println("������ �Է��ϼ��� : ");
		String major = sc.nextLine();
		
		System.out.println("�й��� �Է��ϼ��� : ");
		int ID = sc.nextInt();
	
		System.out.println("������ �Է��ϼ��� : ");
		double score = sc.nextDouble();
		
		System.out.println("====�л� ����====");
		System.out.println(name + major + ID + score);
		
	}
}
