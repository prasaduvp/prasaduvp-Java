package polymorphism;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("Execution is started");
		
		int fNumber=10;
		int sNumber=0;
		int result=0;
		 
		try {
			result=fNumber/sNumber;
	}catch(ArithmeticException ae) {
		System.out.println(ae.toString());
		throw ae;
	}
		
		
		System.out.println("output is:" + result);
		
		System.out.println("Execution is ended");
	}

}
