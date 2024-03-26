package assignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks");
		int number = scanner.nextInt();
		if (number<35)
			System.out.println("You are failed");
		else if(number==35)
			System.out.println("You are just passed");
		else if(number>35 && number<70)
			System.out.println("You secured third class");
		else if (number>=70 && number<85)
			System.out.println("You secured second class");
		else
			System.out.println("You secured first class");
		scanner.close();
	}

}
