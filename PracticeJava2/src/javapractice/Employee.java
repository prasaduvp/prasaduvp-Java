package javapractice;

public class Employee {
	
	private int id;
	public String name;
	protected double salary;
	
	public Employee() {
		System.out.println("No argument constructor called");
	}
	
	public void Employee(int id) {
		this.id =id;
	}
	
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}

}
