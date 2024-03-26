package javapractice;

import java.util.Random;

public class StaticOrNonStatic {

	static int number;
	
	public static void main(String[] args) {
		
		StaticOrNonStatic t1 = new StaticOrNonStatic();
		t1.number= new Random().nextInt();
		
		StaticOrNonStatic t2 = new StaticOrNonStatic();
		t2.number = new Random().nextInt();
		
		StaticOrNonStatic t3 = new StaticOrNonStatic();
		t3.number= new Random().nextInt();
		
		
		
//		System.out.println(t1.number);
//		System.out.println(t2.number);
//		System.out.println(t3.number);
		
		System.out.println(StaticOrNonStatic.number);
			
	}

}
