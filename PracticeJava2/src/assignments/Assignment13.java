package assignments;
import java.util.Scanner;
public class Assignment13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		boolean isPrime = true;
		if(number!=1 && number!=2) {
			int j=2;
			while(j<number) {
				if(number%j==0) {
					isPrime=false;
					break;
				}
				j++;
			}
			
		}
		else {
			isPrime=false;
		}
		if(isPrime)
			System.out.println("Given number is a prime number");
		else
			System.out.println("Given number is not a prime number");
		scanner.close();
	}

}
