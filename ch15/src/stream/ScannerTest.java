package stream;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //표준 입력으로부터 자료를 읽어 들임. 
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
	
		System.out.println("전공을 입력하세요 : ");
		String major = sc.nextLine();
		
		System.out.println("학번을 입력하세요 : ");
		int ID = sc.nextInt();
	
		System.out.println("학점을 입력하세요 : ");
		double score = sc.nextDouble();
		
		System.out.println("====학생 정보====");
		System.out.println(name + major + ID + score);
		
	}
}
