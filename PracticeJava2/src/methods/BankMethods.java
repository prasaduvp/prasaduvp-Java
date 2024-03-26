package methods;

public class BankMethods {
	static int currentBalance = 5000;
	
	public static void greetCustomer() {
		System.out.println("Hello, welcome to the banking application");
	}
	
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited successfully");
	}
	
	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawn successfully");
		
	}
	
	public int getcurrentbalance() {
		return currentBalance;
	}
	
	public static void main (String[] args) {
		BankMethods bank = new BankMethods();
		greetCustomer();
		System.out.println("Currentbalance is :"+bank.getcurrentbalance());
		bank.deposit(1500);
		System.out.println("Currentbalance is :"+bank.getcurrentbalance());
		withdrawal(300);
		bank.getcurrentbalance();
		System.out.println("Currentbalance is :"+bank.getcurrentbalance());
		withdrawal(200);
		System.out.println("Currentbalance is :"+bank.getcurrentbalance());
	}

}
