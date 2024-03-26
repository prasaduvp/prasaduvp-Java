package oops;

public class Admin extends Developer{
	
	public void manage() {
		super.read();
		write();
		System.out.println("manage code");
	}
	
	public void read() {
		System.out.println("Admin read code");
		
	}
}
