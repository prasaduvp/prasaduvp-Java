package assignments;
	import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day name:");
		String dayName = scanner.next();
		if(dayName.equals("Monday")||
				dayName.equals("Tueday")||
				dayName.equals("Wednesday")||
				dayName.equals("Thursday")||
				dayName.equals("Friday"))
			System.out.println("Uff it's a weekday");
		else if(dayName.equals("Saturday")||
				dayName.equals("Sunday"))
			System.out.println("Yayy, it's a weekend");
		scanner.close();
	}
	

}
