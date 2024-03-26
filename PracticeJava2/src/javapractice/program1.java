package javapractice;

import java.util.Iterator;

public class program1 {


	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setID(108);
		e.name = "Vara prasad";
		e.salary=50000.00;
		
		Employee e1 = new Employee();
		e1.setID(109);
		e1.name = "Sai kumar";
		e1.salary=100000.00;
		
		Employee e2 = new Employee();
		e2.setID(110);
		e2.name = "Mallikarjuna";
		e2.salary=35000.00;
		
//		System.out.println(e.getID());
//		System.out.println(e.name);
//		System.out.println(e.salary);
		
		Employee at [] = new Employee[] {e,e1,e2};
		
		
	}

	

}
