package javapractice;

public class Test2StaticOrNonStatic {
	
	int number;
	
	static {
		System.out.println("Static block3");
	}
	static {
		System.out.println("Static block2");
	}
	static {
		System.out.println("Static block1");
	}
	
	{
		System.out.println("Non-static block");
	}
	
	public Test2StaticOrNonStatic() {
		System.out.println("Constructor");
		number=30;
	}

	public static void main(String[] args) {
		
		System.out.println("Main method");
//		Test2 t1 = new Test2();
//		System.out.println(t1.number);
//		Test2 t2 = new Test2();
//		Test2 t3 = new Test2();
//		Test2 t4 = new Test2();
//		Test2 t5 = new Test2();
		
	}

}
