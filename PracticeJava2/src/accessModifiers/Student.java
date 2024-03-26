package accessModifiers;

public class Student {
	
	public int rollNo = 107;
	
	public Student() {
		rollNo = 108;
	}
	
	public void printRollNumber() {
		System.out.println(rollNo);
	}
	
	private void abc() {
		System.out.println(rollNo);
		printRollNumber();
	}
	

}
