package polymorphism;

public class Calculations {
	
	
	public int add(int a, int b) {
		return a+b;

	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculations c = new Calculations();
		System.out.println(c.add(5,5));
		
		System.out.println(c.add(5, 10, 15));
	}
}
