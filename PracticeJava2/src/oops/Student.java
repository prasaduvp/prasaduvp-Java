package oops;

public class Student {
	
	public int rollNumber;
	public String name;
	public boolean isAttended;
	
	public Student(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public void setStudentAttendence(boolean flag) {
		if(!isAttended);
		isAttended=flag;
		System.out.println("Teacher assigned attendence to the student");
	}
	
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
