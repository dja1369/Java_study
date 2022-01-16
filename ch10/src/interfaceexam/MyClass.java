package interfaceexam;

public class MyClass	implements MyInterface {

	@Override
	public void x() {
		System.out.println("public void x()");
	}

	@Override
	public void y() {
		System.out.println("public void y()");
	}

	@Override
	public void myMethod() {
		System.out.println("public void myMethod()");
	}

}
