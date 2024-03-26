package assignments;
import java.util.Scanner;
public class Assignment5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();

		System.out.println("Enter the target 0peration");
		String operation = scanner.next();
		
		int result = 0;
		
		switch(operation) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case"/":
			result = num1 / num2;
			break;
		case"%":
			result = num1 % num2;
			break;
			default :
				System.err.println("Invalid operation!!!");
		}
		System.out.println(result);
		scanner.close();
	}

}
