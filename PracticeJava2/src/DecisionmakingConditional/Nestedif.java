package DecisionmakingConditional;

public class Nestedif {

	public static void main(String[] args) {
		String examStatus = "pass";
		if(examStatus == "pass") {
			System.out.println("Please wait for further round");
			String round1Status = "pass";
			if(round1Status == "pass") {
				System.out.println("You have cleared round 1 Please wait for 2 round");
				String round2Status = "pass";
				if(round2Status == "fail") {
					System.out.println("You have cleared round 2 Please wait for HR round");
				}
				else {
					System.out.println("You can go to home");
				}
			}
			else {
				System.out.println("You can go to home");
			}
		}
		else {
			System.out.println("You can go to home");
		}
	}

}
