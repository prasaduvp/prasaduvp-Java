package assignments;
import java.util.Scanner;
public class Assignment6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day name");
		String dayName = scanner.next();
		switch(dayName) {
		case "Monday":	
		case "Tuesday":
		case"Wednesday":
		case"Thurday":
		case"Friday":
			System.out.println("Uff it's a weekday");
			break;
			
		case "Saturday":
		case "Sunday":
			System.out.println("YAyy, it's a weekend");
			break;
			default:
				System.out.println("Invalid day name");
				scanner.close();
		}
		
	}

}
