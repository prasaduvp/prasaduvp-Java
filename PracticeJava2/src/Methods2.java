
public class Methods2 {

	static int currentBalance = 7890;

	public static void greetings() {
		System.err.println("Welcome to the banking application");
	}

	public void deposit (int amount) {
		currentBalance = currentBalance + amount;
		System.err.println("Amount is deposited sucessfully");
	}
	public void withdrawal (int amount) {
		currentBalance = currentBalance - amount;
		System.err.println("Amount is withdrawn successfully");
	}
	public int getcurrentBalance() {
		return currentBalance;
	}
	public static void main(String[] args) {
		Methods2 method2 = new Methods2();
		greetings();
		System.err.println("current balance is :" + method2.getcurrentBalance());
		method2.deposit(500);
		System.err.println("current balanceis :" + method2.getcurrentBalance());
		method2.withdrawal(200);
		System.err.println("current balance is :" + method2.getcurrentBalance());
		method2.withdrawal(190);
		System.err.println("currentbalanceis:" + method2.getcurrentBalance());
	}
}
