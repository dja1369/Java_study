package inheritance;

public class TestA {
	int num;
	
	void aa() {
		System.out.println("aa()");
	}
	public static void main(String[] args) {
		TestA test1 = new TestA();
		test1.aa();
	
		TestA test2 = new TestA();
		test2.aa();
	
	}

}
