package methods;


public class BankMethods2 {
		
		static int currentamount = 9540;
		
		public static void greetingtothecustomer() {
			System.out.println("Welcome to the banking application");
		}
		public void deposit(int amount) {
			currentamount = currentamount + amount;
			System.out.println("your amount deposited successfully");
		}
		public static void withdrawal(int amount) {
			currentamount = currentamount - amount;
			System.out.println("your amount is withdrawan successfully");
		}
		public int getcurrentamount() {
			return currentamount;
		}
		public static void main (String[] args) {
			BankMethods2 bank = new BankMethods2();
			greetingtothecustomer();
			System.out.println("currentamount is : " + bank.getcurrentamount());
			bank.deposit(1500);
			System.out.println("currentamount is : " + bank.getcurrentamount());
			withdrawal(500);
			System.out.println("current amount is : " + bank.getcurrentamount());
			
			
		}
}

