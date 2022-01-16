package interfaceexam;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		myclass.myMethod();
		
		X xclass = myclass;
		xclass.x();
		
		Y yclass = myclass;
		yclass.y();
		
		MyInterface iClass = myclass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
	}

}
