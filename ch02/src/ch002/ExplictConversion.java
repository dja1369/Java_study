package ch002;

public class ExplictConversion {
 public static void main(String[] args) {
	int iNum = 200;
	byte bNum = (byte)iNum;
	
	System.out.println(iNum);
	System.out.println(bNum);
	
	double dNum = 3.14;
	iNum = (int) dNum;
	
	System.out.println(dNum);
	System.out.println(iNum);
	
	dNum = 1.5;
	float fNum = 0.7f;
	
	iNum = (int)(dNum + fNum);
	
	System.out.println(iNum);
}
}
