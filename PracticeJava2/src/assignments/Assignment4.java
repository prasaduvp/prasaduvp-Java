package assignments;
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int remainder = num % 2;
		switch(remainder) {
		case 0:
			System.out.println("Given number is Even");
			break;
		case 1: 
			System.out.println("Given number is odd");
			break;
		}
		scanner.close();
		
	}

}
