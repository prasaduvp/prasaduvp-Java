package methods;

public class BankMethods1 {
	
	static int checkBalance = 2500;
	
	public static void greetings() {
		System.out.println("welcome to the Banking application");
	}
	public void depositing(int amount) {
		checkBalance = checkBalance + amount;
	}
	
	public static void withdrawal(int amount) {
		checkBalance = checkBalance - amount;
	}
	
	public int getcheckBalance() {
		return checkBalance;
	}
	
	
	public static void main(String[] args) {
		BankMethods1 bank = new BankMethods1();
		greetings();
		bank.depositing(2500);
		System.out.println("Your amount is :" + bank.getcheckBalance());
		withdrawal(1800);
		System.out.println("Your amount is :" + bank.getcheckBalance());

	}
}
