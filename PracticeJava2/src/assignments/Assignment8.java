package assignments;
	import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter the ending number");
		int endingNumber = scanner.nextInt();
		
		int number=startingNumber;
		while(number<=endingNumber) {
			System.out.println(number);
			number++;
		}
		scanner.close();
		
	}

}
