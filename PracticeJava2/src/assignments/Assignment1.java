package assignments;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to be checked");
		int number = scanner.nextInt();
		if (number>0) {
			if(number%2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		else {
			System.out.println("Enter Integer greater than zero");
		}
		scanner.close();
	}

}
